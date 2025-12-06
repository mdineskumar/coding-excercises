package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementFreq = new HashMap<>();
        int threshold = (int)Math.floor(nums.length / 2.0);
        System.out.println("Threshold = "+threshold);
        for (int i = 0; i < nums.length; i++) {
            int freq;
            if(elementFreq.get(nums[i]) != null){
                freq = elementFreq.get(nums[i]) + 1;
            }else{
                freq = 1;
            }

            elementFreq.put(nums[i], freq);
        }

        int result = 0;
        //loop through hashmap
        for(Map.Entry<Integer,Integer> entry: elementFreq.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            if(val > threshold) {
                result = key;
                break;
            }

        }

        System.out.println(elementFreq.toString());
        //return 0;
        return result;
    }

    //Boyer -Moore Voting Algorithm
    public static int majorityElementLiner(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for(int num: nums) {
            //both of them equal or it is starting
            if(count==0) {
                candidate = num;
            }

            count += (num == candidate) ? 1:-1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,2,3};
        int[] arr2 = {2,2,1,1,1,2,2};

//        System.out.println(Arrays.toString(arr1) + " --> "+majorityElement(arr1));
        System.out.println(Arrays.toString(arr1) + " --> "+majorityElementLiner(arr1));
//        System.out.println(Arrays.toString(arr2) + " --> "+majorityElement(arr2));
        System.out.println(Arrays.toString(arr2) + " --> "+majorityElementLiner(arr2));

    }
}
