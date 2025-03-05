package recursion;

import static java.lang.Math.abs;

public class RecursionExample {
    public static int recursiveSum(int n){
        if (n == 0){
            return 0;
        }
        System.out.println("recursive call: "+n);
        return recursiveSum(n-1)+n;
    }

    public static int multiplyMine(int a, int b){
        if (abs(b) == 0){
            return 0;
        }
        if (b < 0){
            return -1*(multiplyMine(a,abs(b)-1) + a);
        }
        return multiplyMine(a,b-1) + a;

    }

    public static int multiply(int a, int b){
        if (a == 0){
            return 0;
        }
        return multiply(a-1,b)+b;
    }

    public static int multiplyFiset(int a, int b){
        if (b == 0){
            return 0;
        }
        if(b < 0){
            return multiplyFiset(a,b+1) - a;
        }
        return multiplyFiset(a, b-1) + a;
    }

    public static void main(String[] args) {
        System.out.println(recursiveSum(9));
        System.out.println("multiplication: 4 * 5: " + multiplyMine(-4,5));
    }
}
