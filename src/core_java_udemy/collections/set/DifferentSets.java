package core_java_udemy.collections.set;

import java.util.*;

public class DifferentSets {
    public static void main(String[] args) {
        System.out.println("+++++++HashSet++++++++");
        Random obj = new Random();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= 5; i++) {
            set.add(obj.nextInt(100));
        }

        System.out.println("Set: "+ set);

        System.out.println("+++++++LinkedHashSet++++++++");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 1; i <= 5; i++) {
            Integer number = obj.nextInt(100);
            linkedHashSet.add(number);
            System.out.println(number);
        }

        System.out.println("linkedHashSet: "+ linkedHashSet);

        System.out.println("+++++++TREESET++++++++");
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= 5; i++) {
            Integer number = obj.nextInt(100);
            treeSet.add(number);
            System.out.println(number);
        }

        System.out.println("treeSet: "+ treeSet);

        Iterator<Integer> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(treeSet);

    }
}
