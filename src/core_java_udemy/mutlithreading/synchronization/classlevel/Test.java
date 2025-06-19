package core_java_udemy.mutlithreading.synchronization.classlevel;

public class Test {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread("Steve");
        MyThread t2 = new MyThread("Dines");
       // System.out.println("Thread: "+Thread.currentThread().getName()+ " before executing!");

        t1.start();
        //System.out.println("Thread: "+Thread.currentThread().getName()+ " in executing!");
        t2.start();

        //System.out.println("Thread: "+Thread.currentThread().getName()+ " after executing!");


    }
}
