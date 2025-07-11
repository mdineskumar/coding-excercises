package core_java_udemy.java8features.defaultmethods;

public interface X {
    default void m2(){
        System.out.println("default method inside X");
    }
}
