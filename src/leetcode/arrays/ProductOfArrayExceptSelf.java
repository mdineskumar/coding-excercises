package leetcode.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            int tempResult = 1;
            for(int j = 0; j < nums.length;j++){
                if(i != j){
                    tempResult = tempResult * nums[j];
                }
            }
            result[i] = tempResult;
        }
        return result;
    }

    public static int[] productExceptSelfOptimal(int[] nums) {
        int[] result = new int[nums.length];
        int[] rightMultiply = new int[nums.length];
        int[] leftMultiply = new int[nums.length];


        leftMultiply[0] = 1;
        //calculate left multiply
        for(int i = 1; i < nums.length ;i++){
           leftMultiply[i] = nums[i-1] * leftMultiply[i-1];
        }


        rightMultiply[nums.length - 1] = 1;

        //calculate right multiply
        for(int j = nums.length - 2; j >= 0;j-- ){
            rightMultiply[j] = nums[j+1] * rightMultiply[j+1];
        }


        //calculate result
        for(int k = 0; k< nums.length;k++){
            result[k] = leftMultiply[k] * rightMultiply[k];
        }
        return result;
    }

    public static int[] productExceptSelfOptimalExtraSpaceConstant(int[] nums) {
        int[] answer = new int[nums.length];
        int prefixProduct = 1;
        //calculate left multiply
        for(int i = 0; i < nums.length ;i++){
            answer[i] = prefixProduct ; // only assign prefix product upto that index exclude that element
            prefixProduct *= nums[i]; //this one next element prefix product
        }


        //rightMultiply[nums.length - 1] = 1;
        int suffixProduct = 1;
        //calculate final result using x
        //suffixProduct is hold multiplication of right of element i

        for(int j = nums.length - 1; j >= 0;j-- ){
            answer[j] = suffixProduct * answer[j]; // answer have already left side products
            suffixProduct *= nums[j]; //prepare for next element from right side

        }

        return answer;
    }

    public static void main(String[] args) {
        printResults(new int[]{1,2,3,4});
        printResults(new int[]{-1,1,0,-3,3});
    }
    
    public static void printResults(int[] input){
        System.out.println(Arrays.toString(productExceptSelfOptimalExtraSpaceConstant(input)));
    }
    
}
