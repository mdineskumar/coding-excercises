package core_java_udemy.java8features.lambdas.basics;

public class Test {
    public static void main(String[] args) {
        A a = new C();
        a.myMethod();

        A a1 = ()-> System.out.println("inside myMethod");
        a1.myMethod();

    }
}
