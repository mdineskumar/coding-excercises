package core_java_udemy.mutlithreading.synchronization.threadcommunication;



public class MainThread {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        synchronized (t1){
            try {
                System.out.println("Main thread is going to wait");
                t1.wait();
                System.out.println("Main thread is notified");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Total: "+t1.getTotal());
        }

    }
}
