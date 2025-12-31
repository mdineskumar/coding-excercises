package leetcode.arrays;

import java.util.Arrays;

public class FirstMissingPositiveSecondAttempt {
    public static int firstMissingPositive(int[] nums) {
        //iterate through array and swap numbers to their correct positions if they are within the valid range(1 to n)

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            //swap numbers
           // how to come up with this logic
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
           if(nums[i] != i+1){
               return i+1;
           }

        }

        return n+1; //if all numbers 1 to n are present, return n+1
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr1));
    }
}
