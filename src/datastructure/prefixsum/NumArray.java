package datastructure.prefixsum;

import java.util.Arrays;

public class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        System.out.println("Prefix sum: "+ Arrays.toString(prefixSum));

    }
    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));

    }

}