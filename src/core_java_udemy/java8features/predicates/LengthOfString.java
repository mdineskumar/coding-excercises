package core_java_udemy.java8features.predicates;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String[] args) {
        Predicate<String> p = s -> (s.length() > 5);
        System.out.println(p.test("xyz"));
        System.out.println(p.test("xyz435"));
        System.out.println(p.test("xyz11"));
    }
}
