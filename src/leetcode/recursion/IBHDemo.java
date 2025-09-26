package leetcode.recursion;

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
    public static void main(String[] args) {
        solveR(7);
        //solve(7);
    }
}
