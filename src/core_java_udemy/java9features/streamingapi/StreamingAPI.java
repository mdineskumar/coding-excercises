package core_java_udemy.java9features.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamingAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40,  7,18, 23,30,null);

//        List<Integer> multipleOfFiveNumbers = list.stream().filter(s -> s % 5 == 0).toList();
//        System.out.println(multipleOfFiveNumbers);

        List<Integer> list1 = list.stream().takeWhile(x -> x % 5 == 0).toList();
        System.out.println(list1);

        List<Integer> list2 = list.stream().dropWhile(x -> x % 5 == 0).toList();
        System.out.println(list2);

        List<Integer> list3 = list.stream().flatMap(x->Stream.ofNullable(x)).toList();
        System.out.println(list3);


    }
}
