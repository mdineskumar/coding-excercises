package core_java_udemy.java8features.lambdas.defaultmethods;

public class B implements A, X{
     public void m1(){
        System.out.println("default method inside b");
    }

    @Override
    public void m2() {
        X.super.m2();
    }
}
