package core_java_udemy.mutlithreading.yield;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child thread");
            Thread.yield();
        }

    }
}
