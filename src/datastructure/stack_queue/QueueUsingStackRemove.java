package datastructure.stack_queue;

import java.util.Stack;


//Insert Efficient
public class QueueUsingStackRemove {
    Stack<Integer> first;
    Stack<Integer> second;
    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        while(!first.empty()){
            int removed = first.pop();
            second.push(removed);
        }
        first.push(x);
        while(!second.empty()){
            int removed = second.pop();
            first.push(removed);
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
