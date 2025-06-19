package core_java_udemy.mutlithreading.synchronization.block;

public class DisplayMessage {
    private static final Object lock = new Object();

    public void sayHello(String name){

//        synchronized (this) {
//        synchronized (DisplayMessage.class) {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println("How are you: " + name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
