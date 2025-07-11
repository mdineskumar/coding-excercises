package core_java_udemy.java8features.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println("isPresent: "+empty.isPresent());
        Optional<String> data = Optional.of("Optional but very useful");
        System.out.println("isPresent: "+data.isPresent());

        System.out.println("Value: " + data.get());
        if(empty.isPresent()){
            System.out.println(empty.get());//NoSuchElementException
        }

        Optional<String> filtered = data.filter(s -> s.equals("Optional but very useful"));

        System.out.println(filtered);

        System.out.println(data.orElse("Default values"));
        System.out.println(empty.orElse("Default values"));
        data.ifPresent(System.out::println);
        empty.ifPresent(System.out::println);
    }
}
