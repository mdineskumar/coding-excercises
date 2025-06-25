package core_java_udemy.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //generics
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(20));
        list.add(10);//auto boxing
        //list.add(30.45);
        //list.add("Hello");
    }
}
