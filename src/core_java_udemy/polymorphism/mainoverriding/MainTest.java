package core_java_udemy.polymorphism.mainoverriding;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Default main method");
        main(10);
    }

    public static void main(int args){
        System.out.println("main overloading method");
    }
}
