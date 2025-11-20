package leetcode.recursion;

import java.util.Stack;

public class ReverseStackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);


        System.out.println(s.toString());

        ReverseStackDemo.reverse(s);
        System.out.println(s.toString());
    }

    private static Stack<Integer> reverse(Stack<Integer> s) {
        //why size is 1
        if(s.size() == 1){
            return s;
        }
        //2. hypothesis
        int temp = s.pop();
        reverse(s);

        insert(s,temp);
        return s;
    }

    private static Stack<Integer> insert(Stack<Integer> s, int temp) {
        if(s.size() == 0){
            s.add(temp);
            return s;
        }

        //
        int val = s.pop();
        insert(s,temp);

        s.add(val);
        return s;
    }


}
