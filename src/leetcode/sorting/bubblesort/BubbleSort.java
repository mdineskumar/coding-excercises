package leetcode.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            boolean swaps = false;
            for (int j = 0; j < nums.length - 1; j++) {
                int left = nums[j];
                int right = nums[j+1];
                //place numbers lower on the left and higher on right side
                if(left > right){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    //swaps marks
                    swaps = true;

                }
            }
            //if no swaps are made in end of iteration then array is sorted
            if(!swaps){
                return;
            }
        }

    }
    public static void main(String[] args) {
        int[] nums = {4,2,1,3};
        sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
