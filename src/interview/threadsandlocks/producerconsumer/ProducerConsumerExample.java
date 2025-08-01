package interview.threadsandlocks.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        //create shared resources
        int maxSize = 5;
        Queue<Integer> queue = new LinkedList<>();
        Object lock = new Object();

        //create producer and consumer tasks
        ProducerThread producerTask = new ProducerThread(queue,maxSize,lock);
        ConsumerThread consumerTask = new ConsumerThread(queue,lock);

        //create thread for tasks
        Thread producerThread = new Thread(producerTask);
        Thread producerThread2 = new Thread(producerTask);
        Thread consumerThread1= new Thread(consumerTask);
        Thread consumerThread2 = new Thread(consumerTask);

        //start threads
        producerThread.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
