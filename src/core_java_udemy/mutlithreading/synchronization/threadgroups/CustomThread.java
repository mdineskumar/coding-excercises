package core_java_udemy.mutlithreading.synchronization.threadgroups;

public class CustomThread extends Thread{

    CustomThread(ThreadGroup tg, String name){
        super(tg,name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
