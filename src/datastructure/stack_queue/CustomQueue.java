package datastructure.stack_queue;

import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];

    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    boolean isFull() {
        //ptr is at last index
        return end == data.length;
    }

    protected boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];
        //need to shoft items
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println("END");

    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(49);
        queue.insert(34);
        queue.insert(33);
        queue.insert(35);
        queue.display();
        queue.remove();
        queue.display();
    }









}
