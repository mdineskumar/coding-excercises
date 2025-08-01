package interview.threadsandlocks.producerconsumer;

import java.util.Queue;

public class ConsumerThread implements Runnable{
    private final Queue<Integer> queue;
    private final Object lock;

    public ConsumerThread(Queue<Integer> queue, Object lock){
        this.lock = lock;
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            synchronized (lock){
                //1. waits if queue is empty
                while(queue.isEmpty()){
                    try {
                        lock.wait();//releases lock and waits
                        System.out.println("Consumer Thread: "+Thread.currentThread().getName()+" is waiting");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //2. get item from queue
                Integer consumedItem = queue.poll();
                System.out.println("ConsumerThread: "+Thread.currentThread().getName()+" Consumed: "+consumedItem);
                lock.notifyAll();
            }
            //Sleeps makes output readble
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
