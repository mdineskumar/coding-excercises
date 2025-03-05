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

    //sums the odd numbers in list
    //index - current index position
    //arr - reference to list
    public static int sumOdds(int index, int[] arr){
        if ( index == arr.length){
            return 0;
        }
        //check if the current number is odd
        if (arr[index] % 2 != 0){
            return sumOdds(index+1,arr) + arr[index];
        }
        return sumOdds(index+1,arr);
    }

    //sums the odd numbers in list
    //i - current index position
    //lst - reference to list
    public static int sumOddsFiset(int i, int[] lst){
        if ( i == lst.length){
            return 0;
        }
        int value = 0;
        if (lst[i] % 2 != 0){
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

    public static int productOfEvenNumbers(int[] lst){
        return productOfEvens(0,lst);
    }

    public static int productOfEvens(int i,int[] lst){
        if (i == lst.length){
            return 1;
        }
        int value = 1;
        if (lst[i] % 2 == 0){
            value = lst[i];
        }
        return productOfEvens(i+1,lst) * value;
    }

    public static void main(String[] args) {
        System.out.println(recursiveSum(9));
        System.out.println("multiplication: 4 * 5: " + multiplyMine(-4,5));
        int[] arr = new int[]{2,3,-4,5,11,6,7};
        int[] arr2 = new int[]{};
        System.out.println("sum of odd numbers: "+ sumOddsInList(arr));
        System.out.println("product of even numbers: "+ productOfEvenNumbers(arr2));

    }
}
