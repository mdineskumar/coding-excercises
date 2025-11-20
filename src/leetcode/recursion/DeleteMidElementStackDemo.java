package leetcode.recursion;

import java.util.Stack;

public class DeleteMidElementStackDemo {
    public Stack<Integer> solve(Stack<Integer> stack, int k) {
        if( k == 1 ) {
            stack.pop();
            return stack;
        }

        // 2. hypothesis;
        int top = stack.pop();
        solve(stack, k-1);

        stack.add(top);
        return stack;
    }

    public Stack<Integer> deleteMiddleElement(Stack<Integer> stack) {
        int k = stack.size()/2 + 1;
        return solve(stack, k);
    }



    public static void main(String[] args) {
        DeleteMidElementStackDemo dmes = new DeleteMidElementStackDemo();
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s.toString());
        dmes.deleteMiddleElement(s);
        System.out.println(s.toString());
    }
}
