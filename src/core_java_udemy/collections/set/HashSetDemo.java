package core_java_udemy.collections.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(obj.nextInt(5));
        }
        System.out.println("list: "+list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println("set: "+set);

    }
}
