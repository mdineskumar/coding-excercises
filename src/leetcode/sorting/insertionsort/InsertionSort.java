package leetcode.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        //1. iterate through array
        for (int i = 1; i < n; i++) {
            //2.remove an element
            int key = nums[i];
            int j = i - 1;
            //3. place it in correct spot - ?
            while(j >= 0 &&nums[j] > key){
                nums[j+1] = nums[j]; // nums[j+1] = nums[j]; it fails because i dont change j is iteration in sorted array.
                j--;
            }
            nums[j+1] = key;

        }
    }
    public static void main(String[] args) {
        int[] nums = {4,2,1,3};
        sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
