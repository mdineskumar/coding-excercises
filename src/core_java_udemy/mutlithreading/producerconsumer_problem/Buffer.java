package core_java_udemy.mutlithreading.producerconsumer_problem;

public class Buffer {
    private final int[] buffer;
    private final int size;
    private int count = 0;

    public Buffer(int size) {
        this.size = size;
        this.buffer = new int[size];

    }

    public synchronized void put(int item) throws InterruptedException {
        while(buffer.length == count){
            wait();
        }
        buffer[count] = item;
        count++;
        notifyAll();
        //System.out.println("Produced: "+item);
    }

    public synchronized int consume() throws InterruptedException {
        while(count == 0){
            wait();
        }
        int item = buffer[count-1];
        count--;
        notifyAll();
        //System.out.println("COnsumed: "+item);
        return item;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
