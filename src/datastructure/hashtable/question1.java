package datastructure.hashtable;
import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complementNumbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(complementNumbers.containsKey(complement)){
                return new int[]{i,complementNumbers.get(nums[i])};
            }
            complementNumbers.put(complement,i);
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 14}, 9)));
    }
}