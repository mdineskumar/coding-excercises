package recursion.leetcode_questions;

public class PowerRecursion {
    public static double myPow(double x, int n){
        if(n==0){
            return 1;
        }
        if(n < 0){
            //stack overflow error
            //need to find a way to do myPow() without stackoverflow
            return 1/x * myPow(x,n+1);
        }
        return x * myPow(x,n-1);
    }

    public static double fastPowAb(double x, int n){
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return fastPow(x,N);
    }

    public static double fastPow(double x,  long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        //recursively calculate power of n/2
        double half = fastPow(x,n/2);

        //if n is even, result is half*half
        if(n % 2 == 0){
            return half*half;
        }
        //if n is odd, result is x * half * half
        else{
            return x*half*half;
        }
    }
    public static void main(String[] args) {
        System.out.println("x = 2, n = 10: "+fastPowAb(2,10));
        System.out.println("x = 2, n = -200000000: "+fastPowAb(2,-200000000));
    }
}
