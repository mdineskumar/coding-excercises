package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        //starting from 1 then 2 and so on, whether each number is present in the array

        for(int i = 1; i < nums.length + 1; i++){
            boolean isFound = false;

            for(int num: nums) {
                if(i == num){
                    isFound = true;
                    break;
                }
            }

            if(!isFound){
                return i;
            }
        }
        return -1;

    }

    public int firstMissingPositiveUsingHashset(int[] nums) {
        //starting from 1 then 2 and so on, whether each number is present in the array

        //instead checking every time need to store all the numbers in hashset and O(1) lookup
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        for(int i = 1; i <= nums.length + 1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        System.out.println(firstMissingPositive.firstMissingPositiveUsingHashset(new int[]{1,2,0}));
        System.out.println(firstMissingPositive.firstMissingPositiveUsingHashset(new int[]{3,4,-1,1}));
        System.out.println(firstMissingPositive.firstMissingPositiveUsingHashset(new int[]{7,8,9,11,12}));
        System.out.println(firstMissingPositive.firstMissingPositiveUsingHashset(new int[]{1}));


    }
}
