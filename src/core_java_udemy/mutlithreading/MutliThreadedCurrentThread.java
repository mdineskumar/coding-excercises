package core_java_udemy.mutlithreading;

public class MutliThreadedCurrentThread extends Thread{
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        currentThread.setName("Print 200 numbers");
        System.out.println("Current Thread Name is: "+currentThread.getName());

    }

    public static void main(String[] args) {
        MutliThreadedCurrentThread mt = new MutliThreadedCurrentThread();
        mt.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread Name is: "+currentThread.getName());
    }
}
