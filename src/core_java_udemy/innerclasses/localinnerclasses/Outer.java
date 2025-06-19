package core_java_udemy.innerclasses.localinnerclasses;

public class Outer {
    void f2(){
        System.out.println("Outer class non static method");
        class LocalInner{
            void f1(){
                System.out.println(" Local Inner class method");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.f1();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f2();
    }
}
