package core_java_udemy.mutlithreading.producerconsumer_problem;

public class Consumer implements Runnable{

    private final Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int item = 0;
            try {
                item = buffer.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ ": Consumed: "+item);
        }
    }
}
