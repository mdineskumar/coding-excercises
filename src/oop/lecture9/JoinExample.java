package oop.lecture9;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread hr1 = new Thread(new HelloRunnable(),"hr1");
        Thread hr2 = new Thread(new HelloRunnable(), "hr2");

        hr1.start();
        hr1.join();//blocks the current thread until hr1 is completed
        hr2.start();
    }
}
