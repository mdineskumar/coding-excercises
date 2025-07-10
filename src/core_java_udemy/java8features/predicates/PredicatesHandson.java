package core_java_udemy.java8features.predicates;

import java.util.function.Predicate;

public class PredicatesHandson {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i >20);

        System.out.println(p.test(34));
        System.out.println(p.test(20));
        System.out.println(p.test(10));
        System.out.println(p.test(30));


    }
}
