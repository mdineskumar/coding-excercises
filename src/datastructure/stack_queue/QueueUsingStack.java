package datastructure.stack_queue;

import java.util.Stack;


//Insert Efficient
public class QueueUsingStack {
    Stack<Integer> first;
    Stack<Integer> second;
    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.empty()){
            int removed = first.pop();
            second.push(removed);
        }
        int top = second.pop();

        while(!second.empty()){
            int removed = second.pop();
            first.push(removed);
        }

        return top;
    }

    public int peek() {
        while(!first.empty()){
            int removed = first.pop();
            second.push(removed);
        }
        int peeked = second.peek();
        while(!second.empty()){
            int removed = second.pop();
            first.push(removed);
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
