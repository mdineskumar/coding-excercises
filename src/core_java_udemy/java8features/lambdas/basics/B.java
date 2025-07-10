package core_java_udemy.java8features.lambdas.basics;

@FunctionalInterface
public interface B extends A{
    //void myMethod2();
    void myMethod();
    //cannot define new method if it continue functional interface
}
