package datastructure.hashtable;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Dines",89);
        ht.put("Kumar",34);
        ht.put("Juii",35);
        ht.put("Iutis",32);

        System.out.println("Marks of : "+ ht.get("Din4es"));

        HashSet<Integer> hs = new HashSet<>();
        hs.add(45);
        hs.add(32);
        hs.add(15);
        hs.add(34);
        System.out.println(hs);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Dines",89);
        tm.put("Kumar",34);
        tm.put("Juii",35);
        tm.put("Iutis",32);
        System.out.println(tm);

        HashTableSeparateChaining<String, Integer> htsc = new HashTableSeparateChaining<>();
        htsc.add("Dines", 45);
        htsc.add("Kumar", 46);
        htsc.add("Iuti", 59);
        System.out.println(htsc.toString());
    }
}
