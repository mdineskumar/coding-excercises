package leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroesWithNewArray(int[] nums) {
        //inplace change
        //input = [0,1,0,3,12]

        int[] result = new int[nums.length];

        int j = 0;
        //move non zero elements to begining
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }

        //copy result to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }


    }

    public static void moveZeroesNotEfficient(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j < nums.length && nums[j] != 0) {
                    //swap with 0
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }
    }

    public static void moveZeroes(int[] nums) {
        //two pointers
        int writePos = 0;

        for (int readPos = 0; readPos < nums.length; readPos++) {
            if(nums[readPos] != 0) {
                //for swapping any conditions we need to check
                int temp = nums[writePos];
                nums[writePos] = nums[readPos];
                nums[readPos] = temp;

                writePos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};

        // moveZeroesWithNewArray(arr1);
        moveZeroes(arr1);

        System.out.println(Arrays.toString(arr1));

    }
}
