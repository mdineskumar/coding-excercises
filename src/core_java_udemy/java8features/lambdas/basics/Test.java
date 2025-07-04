package core_java_udemy.java8features.lambdas.basics;

public class Test {
    public static void main(String[] args) {
       A a = ()-> System.out.println("inside myMethod");
       a.myMethod();


    }
}
