package leetcode.recursion;

import java.util.Stack;

public class SortStackDemo {
    public Stack<Integer> sort(Stack<Integer> stack) {
        //1. Base Condition
        if (stack.size() == 1) return stack;

        // 2. Hypothesis
        int topElement = stack.pop();
        System.out.println(stack.toString());
        sort(stack);

        insert(stack, topElement);
        return stack;
    }
    public Stack<Integer> insert(Stack<Integer> stack, int temp) {
        //1. Base condition. check size and if the top element is less than temp then add it as top
        if (stack.size() == 0 || stack.peek() <= temp) {
            stack.add(temp);
            return stack; // i forget this statement
        }

        //2. hypothesis
        int topElement = stack.pop();
        insert(stack, temp);

        stack.add(topElement);
        return stack;
    }

    public static void main(String[] args) {
        SortStackDemo ssd = new SortStackDemo();
        Stack<Integer> s = new Stack<>();
        s.add(5);
        s.add(1);
        s.add(0);
        s.add(2);
        ssd.sort(s);
        System.out.println(s.toString());
        for (Integer i : s) {
            System.out.print(i + " ");
        }
    }

}
