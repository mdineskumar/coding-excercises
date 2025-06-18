package core_java_udemy.exceptions.synchornization.blocks;

public class SynchronizationDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1  = new MyThread(dm,"DInes");
        MyThread t2 = new MyThread(dm,"Kumar");
        t1.start();
        t2.start();
    }
}
