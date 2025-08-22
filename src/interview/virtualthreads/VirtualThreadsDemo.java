package interview.virtualthreads;

public class VirtualThreadsDemo {
    public static void main(String[] args) {
        Thread thread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from a virtual thread!");
        });

        try {
            thread.join(); // Wait for the virtual thread to finish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread finished.");
    }
}
