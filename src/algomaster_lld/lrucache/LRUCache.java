package algomaster_lld.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K,V> {
    //why they used final
    private final int capacity;
    private Map<K, Node<K,V>> map;
    private DoublyLinkedList<K,V> dll;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        //you forget to intialize
        this.map = new HashMap<>();
        this.dll = new DoublyLinkedList<>();
    }

    public Node<K,V> get(K key) {
        //TODO: implement get()
        //you forget check
        if(!map.containsKey(key)) return null;
        Node<K, V> node = map.get(key);
        //you forget to add to ddl, recency order
        dll.addFirst(node);//need to make sure this is not null
        return node;
    }

    public void put(K key, V value) {
        //TODO: implement put()
        if(map.containsKey(key)){
            //access node
            Node<K, V> node = map.get(key);
            //you forget to change value
            node.value = value;
            //move to recently used
            dll.moveToFirst(node);
            

        }else{
            //what if capacity is full
            //you struggle to find how to get capacity
            if(map.size() == capacity){
                //remove lru
                Node<K, V> lru = dll.removeLast();
                //you forget to check if(lru==null)
                if(lru!= null) map.remove(lru.key);
            }

            Node newNode = new Node(key,value);
            map.put(key, newNode);
            //move to recently used
            dll.moveToFirst(newNode);

            //capacity++;you add this constant that canot be changed
        }

    }

    public Node<K,V> remove(K key){
        //TODO: implement remove()
        if(!map.containsKey(key)) return null;
        Node<K, V> node = map.get(key);
        dll.remove(node);
        map.remove(node);
        return null;
    }
}
