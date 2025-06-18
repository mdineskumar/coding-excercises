package core_java_udemy.exceptions.synchornization.classlock;

public class SynchronizationDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1  = new MyThread("DInes");
        MyThread t2 = new MyThread("Kumar");
        t1.start();
        t2.start();
    }
}
