package core_java_udemy.java8features.methodref;

public class MethodRefDemo {
    public static void myMethod(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread static mehtod ");
        }
    }

    public void myInstanceMethod(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread in instance method mapping");
        }
    }
    public static void main(String[] args) {
        Runnable r = MethodRefDemo::myMethod;
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }

        MethodRefDemo m = new MethodRefDemo();
        Runnable r1 = m::myInstanceMethod;
        Thread t1 = new Thread(r);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread after instance method mapping");
        }
    }
}
