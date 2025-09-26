package leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class IBHDemo {
    //print 1 to n
    private static void solve(int n){
        if(n==0) return;
        solve(n-1);
        System.out.println(n);
    }

    //print n to 1
    private static void solveR(int n){
        //base condition
        if(n==0) return;
        //induction
        System.out.println(n);
        solveR(n-1);//hypothesis
    }

    private static ArrayList<Integer> sort(ArrayList<Integer> arr){
        //base condition
        if(arr.size() == 1) return arr;

        //hypothesis

        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);

        System.out.println(arr);
        System.out.println(arr.size());
        sort(arr);

        insert(arr,temp);

        return arr;


    }
    private static ArrayList<Integer> insert(ArrayList<Integer> arr, int temp) {

        //how is it insert
        //what is basecondition
        if(arr.size() == 0 || arr.get(arr.size()-1) <= temp) {
            //insert it last
            arr.add(temp);
            return arr;
        }

        //hypothesis
        int val = arr.get(arr.size() - 1);//getting out 5
        arr.remove(arr.size() - 1);//removing 5 from array -> [0,1]


        insert(arr, temp);//we are trying to insert 2 into  [0,1] --> [0,1,2]

        arr.add(val);//adding 5 to [0,1,2] which becomes -> [0,1,2,5]

        return arr;
    }

    public static void main(String[] args) {
        solveR(7);
        //solve(7);

        System.out.println(sort(new ArrayList<>(Arrays.asList(5,1,0,2))));
    }
}
