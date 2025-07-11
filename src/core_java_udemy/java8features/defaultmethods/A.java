package core_java_udemy.java8features.defaultmethods;

public interface A {
    public void m1();
    default void m2(){
        System.out.println("default method inside A");
    }
}
