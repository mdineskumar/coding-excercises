package core_java_udemy.mutlithreading.synchronization.deadlock;

public class DeadlockDemo implements Runnable{
    FirstResource fr = new FirstResource();
    SecondResource sr = new SecondResource();

    DeadlockDemo(){
        new Thread(this).start();
        sr.method1(fr);
    }


    public static void main(String[] args) {
        new DeadlockDemo();
    }


    @Override
    public void run() {
        fr.method1(sr);
    }
}
