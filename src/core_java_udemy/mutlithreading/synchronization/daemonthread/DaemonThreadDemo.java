package core_java_udemy.mutlithreading.synchronization.daemonthread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        MyThread thread1 = new MyThread();
        thread1.setDaemon(true);
        System.out.println(thread1.isDaemon());
        thread1.start();

    }
}
