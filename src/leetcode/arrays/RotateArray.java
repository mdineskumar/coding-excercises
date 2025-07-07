package leetcode.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k){
        int[] modified = new int[nums.length];
        int l = 0;
        int r = modified.length - 1;

        while(l < k){
            modified[l] = nums[r];
            r--;
            l++;
        }



       for(int j = 0; j <= r;j++){
           modified[l] = nums[j];
           l++;
       }

       for(int m = 0; m < nums.length;m++){
           nums[m] = modified[m];
       }
//        System.out.println(Arrays.toString(nums));

    }

    public static void rotateNext(int[] nums, int k){
        if(nums.length <= 1 || k == 0){
            return;
        }
//        int increment = 1;
        int[] modified = new int[nums.length];
//        while(increment <= k){
            for(int i = 0; i < nums.length;i++){
                int fill = (i + k) % nums.length;
                modified[fill] = nums[i];
            }
//            increment++;
//        }

        for(int m = 0; m < nums.length;m++){
            nums[m] = modified[m];
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        rotateNext(nums1,3);
        System.out.println(Arrays.toString(nums1));
        int[] nums2 = {-1,-100,3,99};
        rotateNext(nums2,2);
        System.out.println(Arrays.toString(nums2));

    }
}
