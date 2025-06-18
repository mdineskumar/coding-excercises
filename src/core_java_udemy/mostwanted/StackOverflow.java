package core_java_udemy.mostwanted;

public class StackOverflow {
    static void method1(){
        System.out.println("method1");
        method2();
    }

    static void method2(){
        System.out.println("method2");
        method1();
    }
    public static void main(String[] args) {
        method1();
    }
}
