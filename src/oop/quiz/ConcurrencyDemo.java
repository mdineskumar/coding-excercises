package oop.quiz;

public class ConcurrencyDemo {

    public Object obj = null;
    int count = 0;
    public void counter() {

        synchronized (obj) {
            System.out.println("In the critical section");
            count++;
        }
    }

    public static void main(String[] args) {
        ConcurrencyDemo concurrencyDemo = new ConcurrencyDemo();
        Thread t1 = new Thread(() -> concurrencyDemo.counter());

        t1.start();

    }
}
