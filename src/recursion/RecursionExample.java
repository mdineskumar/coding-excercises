package recursion;

import java.net.Inet4Address;
import java.util.Arrays;

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

    public static int multiplyFiset(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return multiplyFiset(a,b+1) - a;
        }
        return multiplyFiset(a, b-1) + a;
    }

    //sums the odd numbers in list
    //index - current index position
    //arr - reference to list
    public static int sumOdds(int index, int[] arr){
        if ( index == arr.length){
            return 0;
        }
        //check if the current number is odd
        if (arr[index] % 2 != 0) {
            return sumOdds(index+1,arr) + arr[index];
        }
        return sumOdds(index+1,arr);
    }

    //sums the odd numbers in list
    //i - current index position
    //lst - reference to list
    public static int sumOddsFiset(int i, int[] lst){
        if ( i == lst.length) {
            return 0;
        }
        int value = 0;
        if (lst[i] % 2 != 0) {
            value = lst[i];
        }
        return sumOddsFiset(i+1,lst) + value;
    }

    //wrapper function around sumOdds or sumOddsFiset to
    //avoid callers needing to specify 0
    //as start index for sumOdds
    public static int sumOddsInList(int[] lst){
        return sumOddsFiset(0,lst);
    }

    public static int productOfEvenNumbersMine(int[] lst){
        return productOfEvens(0,lst);
    }

    public static int productOfEvens(int i,int[] lst){
        if (lst.length == 0){
            return 0;
        }
        if (i == lst.length){
            return 1;
        }
        int value = 1;
        if (lst[i] % 2 == 0){
            value = lst[i];
        }
        return productOfEvens(i+1,lst) * value;
    }

    public static int productOfEvenNumbers(int[] lst){
        Integer product = f(0,lst); // starting at 0
        if (product == null){ // empty list or all the numbers in the list odd numbers
            return 0;
        }
        return product;
    }

    public static Integer f(int i, int[] lst){
        if (i == lst.length){ // base condition: current position at end of list
            return null;//there is no product at the moment
        }
        Integer product = f(i+1,lst);

        if (lst[i] % 2 != 0){ // check if current element is odd
            return product; // current product or null : previous numbers also odd
        }
        if (product == null){//once we know current number is even then need to handle case where there is no product yet
           return lst[i]; //return the element at current position
        }
        //integer overflow

        return lst[i]*product; //otherwise multiply the current element and running product together
    }

    public static void isPalindrome(String s){
        boolean isPalindrome = f(s);
        if(isPalindrome){
            System.out.println(s + " is a palindrome");
        }else{
            System.out.println(s+" is not a palindrome");
        }
    }

    public static boolean f(String s) {
        int n = s.length();
        if (n <= 1) {
            return true;
        }
        char left = s.toLowerCase().charAt(0);
        char right = s.toLowerCase().charAt(n-1);
        if (left != right) {
            return false;
        }
        String substring = s.substring(1,n-1);
        return f(substring);

    }

    public static Pair findMinMax(int a, int b){
        if ( a < b ){
            return new Pair(a,b);
        }
        return new Pair(b,a);
    }

    //calling findMax with starting index, reference to list
    //which delegates work of finding maximum value and its index to findMax function
    public static Pair findMaximumElement(int[] lst) {
        return findMax(0,lst);
    }

    //i - current index
    //lst- reference to list
    public static Pair findMax(int i, int[] lst) {
        //base condition
        if ( i == lst.length) {
            return new Pair(null,null);
        }

        Pair bestIndexPair = findMax(i+1,lst);
        Integer bestMax = bestIndexPair.first;
        Integer bestIndex = bestIndexPair.second;

        //no best maximum yet
        if (bestMax == null || lst[i] > bestMax) {
            bestMax = lst[i];
            bestIndex = i;
        }
        return new Pair(bestMax,bestIndex);
    }



    public static void main(String[] args) {
        System.out.println(recursiveSum(9));
        System.out.println("multiplication: 4 * 5: " + multiplyMine(-4,5));
        int[] arr = new int[]{2,3,-4,5,11,6,7};
        int[] arr2 = new int[]{};
        System.out.println("sum of odd numbers: "+ sumOddsInList(arr));
        System.out.println("product of even numbers: []: "+ productOfEvenNumbers(new int[]{}));
        System.out.println("product of even numbers: [6,0]: "+ productOfEvenNumbers(new int[]{6,0}));
        System.out.println("product of even numbers: [-8,-3,2]: "+ productOfEvenNumbers(new int[]{-8,-3,2}));
        System.out.println("product of even numbers: [1,2,3,4,5]: "+ productOfEvenNumbers(new int[]{1,2,3,4,5}));
        System.out.println("product of even numbers: [1,7,3]: "+ productOfEvenNumbers(new int[]{1,7,3}));


        System.out.println("Testing palindrome===========");
        String s1 = "ababa";
        String s2 = "765432";
        String s3 = "madam";
        String s4 = "palindrome";
        String s5 = "";
        isPalindrome(s1);
        isPalindrome(s2);
        isPalindrome(s3);
        isPalindrome(s4);
        isPalindrome(s5);

        System.out.println("===Find Maximum element in the list and return multiple values ======");
        int[] lst1 = {2,1,3,-4,2};
        int[] lst2 = {};
        int[] lst3 = {2};
        printResultForFindMaximumElement(lst1);
        printResultForFindMaximumElement(lst2);
        printResultForFindMaximumElement(lst3);

    }

    public static void printResultForFindMaximumElement(int [] lst){
        Pair result = findMaximumElement(lst);
        System.out.println(Arrays.toString(lst) +"-->"+ result.toString());
    }

}

class Pair{
    Integer first;
    Integer second;

    public Pair(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Best max: "+first+" Best index: "+second;
    }
}
