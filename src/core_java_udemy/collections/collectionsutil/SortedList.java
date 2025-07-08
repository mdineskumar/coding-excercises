package core_java_udemy.collections.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Z");
        l.add("A");
        l.add("X");
        l.add("B");
        System.out.println("Before sorting: "+l);

        Collections.sort(l);
        System.out.println("After sorted: "+l);
        Collections.sort(l, new MyComparator());
        System.out.println("After sorted: "+l);

        int result = Collections.binarySearch(l, "C");
        System.out.println("Index is: "+result);

        int result2 = Collections.binarySearch(l, "X");
        System.out.println("Index is: "+result2);
    }

}
