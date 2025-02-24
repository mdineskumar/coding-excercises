package recursion;

public class RecursionExample {
    public static int recursiveSum(int n){
        if (n == 0){
            return 0;
        }
        System.out.println("recursive call: "+n);
        return recursiveSum(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(recursiveSum(9));
    }
}
