package leetcode.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] nums) {


        //why n - 1 -> only left 1 element to find smallest
        for (int i = 0; i < nums.length - 1; i++) {
            //take first element as smallest
            int smallestIndx = i;
            boolean foundSmallest = false;
            for (int j = i; j < nums.length; j++) {
                //if we find smllest element in unsorted list place it in end of the sortedlist
                if(nums[smallestIndx] > nums[j]){
                    smallestIndx = j;
                    foundSmallest = true;
                }
            }

            //if smallest element found then only swap
            if(foundSmallest) {
                int temp = nums[smallestIndx];
                nums[smallestIndx] = nums[i];
                nums[i] =temp;
                foundSmallest = false;
            }


        }

    }
    public static void main(String[] args) {
        int[] nums = {4,2,1,3};
        sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
