package core_java_udemy.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIDemo
{
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("def");
        list.add("xyz");

        System.out.println("Traversing list in the forward");
        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Traversing list in the back");

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
