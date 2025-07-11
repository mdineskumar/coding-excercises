package core_java_udemy.java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer>  l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }

        System.out.println(l1);
        //List<Integer> l2 = new ArrayList<>();

//        for(Integer i : l1){
//            if(i%2==0){
//                l2.add(i);
//            }
//        }
        Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);

        List<Integer> l2 = l1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(l2);
        long count = l1.stream().filter(a -> a % 2 == 0).count();
        System.out.println(count);
        List<Integer> sorted = l1.stream().filter(a -> a % 2 == 0).sorted(comp).collect(Collectors.toList());
        System.out.println(sorted);

        Integer max = l1.stream().max(comp).get();
        System.out.println(max);

        Integer min = l1.stream().min(comp).get();
        System.out.println(min);

        l1.stream().forEach(i-> System.out.println(i));
    }
}
