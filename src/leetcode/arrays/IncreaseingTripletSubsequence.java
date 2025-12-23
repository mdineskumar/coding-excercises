package leetcode.arrays;

import java.util.Arrays;

public class IncreaseingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        //1st loop to get a
        for (int i = 0; i < n-2; i++) {

            System.out.println("Loop through ");
            //2nd loop to iterarte b
            for (int j = i+1; j < n-1; j++) {
                //3rd loop to iterate c
                for (int k = j+1; k < n; k++) {

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums_1 = {1,2,3,4,5};
        int[] nums_2 = {5,4,3,2,1};
        int[] nums_3 = {2,1,5,0,4,6};

        System.out.println(Arrays.toString(nums_1) + "--> "+increasingTriplet(nums_1));
        System.out.println(Arrays.toString(nums_2) + "--> "+increasingTriplet(nums_2));
        System.out.println(Arrays.toString(nums_3) + "--> "+increasingTriplet(nums_3));

    }


}
