package core_java_udemy.innerclasses.staticinnerclasses;

public class Outer {

    static void f1(){
        System.out.println("Out static method");
    }

    static class Inner{
        int i;
        static void f1(){
            System.out.println("Inner static method");
        }

        void f2(){
            System.out.println("Inner non static method");
        }
    }

    public static void main(String[] args) {
        Outer.f1();
        Outer.Inner.f1();

        Outer.Inner obj = new Outer.Inner();

        obj.f2();
    }
}
