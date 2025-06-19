package core_java_udemy.mutlithreading.synchronization.threadcommunication;

public class MyThread extends Thread{

    int total;

    public int getTotal() {
        return total;
    }

    @Override
    public void run() {
        System.out.println("Child tthead calculating sum");

        synchronized (this){
            for (int i = 0; i <= 100; i++){
                total += i;
            }
            notify();
        }

    }
}
