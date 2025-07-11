package core_java_udemy.mutlithreading.producerconsumer_problem;

public class Producer implements Runnable{

    private final Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }


    @Override
    public void run() {
        try {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println(Thread.currentThread().getName()+ ": Produced: "+i+", Buffer size: "+buffer.getCount());
            Thread.sleep(500);
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
