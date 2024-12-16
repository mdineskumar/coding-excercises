package datastructure.stack_queue;

import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];

    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new StackException("Can not pop from an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new StackException("Can not peek from an empty stack");
        }
        return data[ptr];

    }



    boolean isFull() {
        //ptr is at last index
        return ptr == data.length - 1;
    }

    protected boolean isEmpty(){
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicSta(5);
        stack.push(34);
        stack.push(56);
        stack.push(43);
        stack.push(65);
        stack.push(43);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
