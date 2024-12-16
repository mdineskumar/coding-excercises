package datastructure.stack_queue;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(58);
        queue.offer(300);

        System.out.println(queue.poll());


        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(13);
        deque.addLast(94);
        deque.addLast(89);
        deque.removeFirst();
        deque.removeLast();



    }
}
