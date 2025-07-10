package core_java_udemy.java8features.functions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s->s.length();
        System.out.println(f1.apply("Dines"));
        System.out.println(f1.apply("John"));


    }
}
