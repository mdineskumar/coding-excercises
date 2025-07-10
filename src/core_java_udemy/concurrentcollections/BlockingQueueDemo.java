package core_java_udemy.concurrentcollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
        OrderConsumer orderConsumer = new OrderConsumer(queue);
        OrderProducer orderProducer = new OrderProducer(queue);

        new Thread(orderProducer).start();
        new Thread(orderConsumer).start();
    }
}
