package core_java_udemy.mutlithreading.synchronization.block;

public class Test {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread(dm, "Steve");
        MyThread t2 = new MyThread(dm, "Dines");
       // System.out.println("Thread: "+Thread.currentThread().getName()+ " before executing!");

        t1.start();
        //System.out.println("Thread: "+Thread.currentThread().getName()+ " in executing!");
        t2.start();

        //System.out.println("Thread: "+Thread.currentThread().getName()+ " after executing!");


    }
}
