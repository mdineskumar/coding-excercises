package core_java_udemy.java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 20, 39);

        List<Integer> collect = list.stream().filter(s -> s % 3 == 0).collect(Collectors.toUnmodifiableList());

        //collect.add(13);

    }
}
