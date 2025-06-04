package core_java_udemy;

public class HelloWorld {
    static int num = 19;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HelloWorld.method(); //invoke the function
    }
    static {
        System.out.println("static block 2 executed");
    }
    static {
        System.out.println("static block 1 executed");
    }
    static void method() {
        System.out.println("inside method 1");
    }

}
