package systemdesign;

import designpattern.iterator.PancakeHouseMenu;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ConsistentHashing {
    //properties
    private final TreeMap<Long, String> ring;
    private final Set<String> servers;

    private final int numReplicas;

    public ConsistentHashing(List<String> servers, int numReplicas) {
        this.servers = new HashSet<>();
        this.numReplicas = numReplicas;
        this.ring = new TreeMap<>();

        //add each server to servers set
        for( String server: servers ) {
            addServer(server);
        }

    }

    public void addServer(String server) {
        servers.add(server);
        for(int i = 0; i< numReplicas;i++) {
            String name = server + "-"+i;
            long hashValue = hash(name);
            //System.out.println(name+": "+hashValue);
            this.ring.put(hashValue,server);
           // printRing();

        }

    }

    //get server for key
    //return server name
    public String getServer(String key) {
        Long hash = hash(key);
        System.out.println("data hash: "+hash);
//  find server in the ring clockwise direction
        Map.Entry<Long, String> entry = this.ring.ceilingEntry(hash);
        System.out.println("server hash: "+entry.getKey() + "server name: "+entry.getValue());

        if(entry == null){
            //If we exceed the highest node wrap around to the first node
            entry = this.ring.firstEntry();
        }
        return entry.getValue();

    }

    public void removeServer(String server) {
        if(servers.remove(server)) {
            for (int i = 0; i < numReplicas; i++) {
                long hashValue = hash(server+"-"+i);
                this.ring.remove(hashValue);
            }
        }
    }

    public Long hash(String key) {
        //i dont know about this need to research on this.
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(key.getBytes());
            byte[] digest = md.digest();
            return ((long) (digest[0] & 0xFF) << 24) |
                    ((long) (digest[1] & 0xFF) << 16) |
                    ((long) (digest[2] & 0xFF) << 8) |
                    ((long) (digest[3] & 0xFF));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }

    // New method to print the hash ring
    public void printRing() {
        System.out.println("\n--- Current Hash Ring ---");
        if (ring.isEmpty()) {
            System.out.println("The hash ring is empty.");
            return;
        }
        for (Map.Entry<Long, String> entry : ring.entrySet()) {
            System.out.println("Hash: " + entry.getKey() + " -> Server: " + entry.getValue());
        }
        System.out.println("-------------------------\n");
    }
}
