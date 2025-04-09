package datastructure.stack_queue;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterator<T> {

    LinkedList<T> list = new LinkedList<T>();

    public Stack() {

    }

    public Stack(T firstElem){
        list.add(firstElem);
    }

    public void push(T elem){
        list.addLast(elem);
    }

    public T pop(){
        if(isEmpty())
            throw new EmptyStackException();
       // T o = list.removeLast();
        return list.removeLast();
    }
    //see the element top of the stack without deleteing
    public T peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return list.getLast();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(34);
        stack.push(-1);
        stack.push(10);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
