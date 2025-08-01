package interview.threadsandlocks.producerconsumer;

import java.util.List;
import java.util.Queue;
import java.util.Random;

public class ProducerThread implements Runnable{
    final Queue<Integer> queue;
    final int maxSize;


    private final Object lock;
    private int item = 0; //item to produce

    public ProducerThread(Queue<Integer> queue, int maxSize, Object lock){
        this.queue = queue;
        this.maxSize = maxSize;
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true){
            synchronized (lock){
                //1. wait if queue is full
                while(queue.size() == maxSize){
                    try {
                        lock.wait();//release lock and waits
                        System.out.println("Producer Thread: "+Thread.currentThread().getName()+" is waiting");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //2. Produce and add item to queue
                System.out.println("ProducerThread: "+Thread.currentThread().getName()+" Produced: "+item);
                queue.add(item++);

                //3. notify consumers that an item is available
                lock.notifyAll();

            }

            //sleep to make output readable
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
