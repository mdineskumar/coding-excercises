package recursion;

public class FibonacciNumberRecursion {

    public static int fib(int n){
        if (n < 2 ){
            return n;
        }

        return fib(n - 1) + fib(n-2);
    }


    public static void main(String[] args) {
        System.out.println("Fib Number: "+ fib(17));
    }
}
