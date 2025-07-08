package core_java_udemy.collections.arraysutil;

import core_java_udemy.collections.collectionsutil.MyComparator;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {40,10,15,7};
        System.out.println("Before sort: "+ Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After sort: "+Arrays.toString(a));

        String[] s = {"V","A","Z","P"};
        System.out.println("Before SOrting: "+Arrays.toString(s));
        Arrays.sort(s,new MyComparator());
        System.out.println("After sort: "+Arrays.toString(s));

        List<String> list = Arrays.asList(s);

        s[1] = "Y";
        list.add("O");//cannot use operation that change size of an array

        System.out.println(list);


    }
}
