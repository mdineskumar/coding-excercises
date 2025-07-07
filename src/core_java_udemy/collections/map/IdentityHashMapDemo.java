package core_java_udemy.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

import static java.lang.Integer.valueOf;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        //hashmap uses equals comparison
        //identityhashmap uses == comparison
        Map<Integer, String> map = new IdentityHashMap<>();
        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);
        map.put(id1,"Bharath");
        map.put(id2,"Sarath");
        System.out.println(map);
        System.out.println(id1.hashCode());
        System.out.println(id2.hashCode());

    }
}
