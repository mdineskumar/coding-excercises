package core_java_udemy.mutlithreading;

public class MutliThreadedThreadPriority extends Thread{
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread Name is: "+currentThread.getName());

    }

    public static void main(String[] args) {
        MutliThreadedThreadPriority mt = new MutliThreadedThreadPriority();
        mt.setPriority(MAX_PRIORITY);
        mt.setName("mt");
        mt.start();

        MutliThreadedThreadPriority mt1 = new MutliThreadedThreadPriority();
        mt1.setPriority(MIN_PRIORITY);
        mt1.setName("mt1");
        mt1.start();
    }
}
