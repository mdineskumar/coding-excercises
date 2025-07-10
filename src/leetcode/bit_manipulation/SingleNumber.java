package leetcode.bit_manipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        int result = -1;
        for(int i = 0; i < nums.length; i++){
            boolean isFound = false;
            for(int j =0;j<nums.length; j++){
                if(i != j){
                    if(nums[i] == nums[j]){
                        isFound = true;
                    }
                }
            }
            if(!isFound){
                result = nums[i];
            }
        }
        return result;
    }

    public static int singleNumberUsingMap(int[] nums){
        Map<Integer,Integer> freqTable = new HashMap<>();
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            freqTable.put(nums[i],freqTable.get(nums[i]) + 1);
        }

        //how to iterate Map
        for(Integer key : freqTable.keySet()){
            if(freqTable.get(key) == 1){
                result =  key;
            }
        }

        return result;
    }

    public static int singleNumberUsingXor(int[] nums){
        int result = 0;

        for(int i = 0; i < nums.length; i++){
           result = result ^ nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};

        System.out.println(Arrays.toString(nums1) + "==> "+singleNumber(nums1));
        System.out.println(Arrays.toString(nums2) + "==> "+singleNumber(nums2));
        System.out.println(Arrays.toString(nums3) + "==> "+singleNumber(nums3));


        System.out.println(Arrays.toString(nums1) + "==> "+singleNumber(nums1));
        System.out.println(Arrays.toString(nums2) + "==> "+singleNumber(nums2));
        System.out.println(Arrays.toString(nums3) + "==> "+singleNumber(nums3));

        System.out.println(Arrays.toString(nums1) + "==> "+singleNumberUsingXor(nums1));
        System.out.println(Arrays.toString(nums2) + "==> "+singleNumberUsingXor(nums2));
        System.out.println(Arrays.toString(nums3) + "==> "+singleNumberUsingXor(nums3));


    }
}
