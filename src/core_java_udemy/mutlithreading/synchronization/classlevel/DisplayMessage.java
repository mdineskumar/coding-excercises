package core_java_udemy.mutlithreading.synchronization.classlevel;

public class DisplayMessage {
    public synchronized static void sayHello(String name){
        for (int i = 0; i < 10; i++) {
            System.out.println("How are you: "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
