package datastructure.hashtable;
import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ht = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            ht.put(nums[i],i);
        }

        int[] result = new int[2];

        for(int j = 0; j < nums.length; j++){
            int curentValue = nums[j];
            int searchValue = target - nums[j];
            Object query = ht.get(searchValue);

            if(query != null){
                result[0] = j;
                result[1] = (int) query;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 0, 11, 14}, 9)));
    }
}