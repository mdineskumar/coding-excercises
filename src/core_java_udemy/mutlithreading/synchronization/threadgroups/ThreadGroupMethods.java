package core_java_udemy.mutlithreading.synchronization.threadgroups;

public class ThreadGroupMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg = new ThreadGroup("My ThreadGroup");

        CustomThread thread1 = new CustomThread(tg,"Thread 1");
        CustomThread thread2 = new CustomThread(tg,"Thread 2");
        CustomThread thread3 = new CustomThread(tg,"Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(tg.activeCount());

        tg.list();
        Thread.sleep(5000);

        System.out.println(tg.activeCount());
        tg.list();




    }
}
