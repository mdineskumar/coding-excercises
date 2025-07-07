package core_java_udemy.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("JOhn",70);
        map.put("TOm",60);
        map.put("Lee",99);
        map.put("Brad",80);

        //keys alone
        Set<String> strings = map.keySet();
        System.out.println("keys: "+strings);

        //values
        Collection<Integer> values = map.values();
        System.out.println("values: "+values);

        for (String key :
                strings) {
            System.out.println("key: "+key+" values: "+map.get(key));
        }

    }
}
