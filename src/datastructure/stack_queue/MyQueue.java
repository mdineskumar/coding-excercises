package datastructure.stack_queue;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue<T> implements Iterator<T> {
    private LinkedList<T> list = new LinkedList<>();

    public MyQueue(){

    }

    public MyQueue(T elem){
        list.addLast(elem);
    }

    public void offer(T elem){
        list.addLast(elem);
    }

    //poll in
    public T poll(){
        if(isEmpty())
            throw new EmptyStackException();
        return list.removeFirst();
    }

    public T peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return list.peekFirst();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public String toString() {

        return "datastructure.stack_queue.Stack{" +
                "list=" + Arrays.toString(list.toArray()) +
                '}';
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.offer(88);
        queue.offer(90);
        queue.offer(100);
        System.out.println(queue.toString());
        queue.poll();
        System.out.println(queue.toString());
    }
}
