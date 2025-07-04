package core_java_udemy.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        //generics
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(20));
        list.add(10);//auto boxing
        list.add(100);
        //list.add(30.45);
        //list.add("Hello");


        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(list);

    }
}
