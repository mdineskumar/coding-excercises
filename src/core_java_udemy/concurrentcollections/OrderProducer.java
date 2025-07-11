package core_java_udemy.concurrentcollections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{
    private BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void put(String order){
        System.out.println("producer put: "+order);
        try {
            queue.put(order);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            queue.put("Mac Book Pro");
            queue.put("Dell");
            queue.put("Iphone");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
