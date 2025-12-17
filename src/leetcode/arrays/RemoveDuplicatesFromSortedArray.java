package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {

    //duplicates always appear next to eachother
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int writePos = 0;
        for (int readPos = 1; readPos < nums.length ; readPos++) {
            if(nums[readPos] != nums[writePos]) {
                writePos++;
                nums[writePos] = nums[readPos];
            }
        }
        return writePos+1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};

        int k1 = removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1) + " --> K = "+k1);

        int k2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2) + " --> K = "+k2);

    }
}
