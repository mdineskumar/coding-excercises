package datastructure.arrays.leet_code;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementDemo {
    public static int majorityElement(int[] nums){
        int times = nums.length / 2;
        Map<Integer,Integer> ht = new HashMap<>();
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int freq = 1;
            if( ht.get(nums[i]) != null ){
                freq = ht.get(nums[i])+1;
            }
            if (freq >= times){
               result = nums[i];
            }
            ht.put(nums[i], freq);
        }
        return result;
    }
    public static int majorityElementByMooreAlgorithm(int[] nums){
        //let first element is majority and votes count 0
        int majority = nums[0];
        int votes = 1;
        for(int i = 1; i < nums.length; i++){
            int element = nums[i];
            //if element == majority increment votes count
            if (element == majority){
                votes++;
            }else{
                votes--;
                if( votes == 0){
                    majority = element;
                    votes = 1;
                }
            }

        }
        return majority;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,2,1,1,1,2,2};
        int[] arr2 = new int[]{3,3,4};
        System.out.println("Majority elements is:"+ majorityElement(arr1));
        System.out.println("Majority elements is:"+ majorityElementByMooreAlgorithm(arr2));
    }
}
