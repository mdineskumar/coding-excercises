package datastructure.arrays.leet_code;

public class Arrays{
    public static void moveZeroes(int[] nums){
            //start from begining position of array
            int nonZeroIndex = 0;
            for(int i = 0; i < nums.length; i++){
                //fill out all nonzero elements
                if(nums[i] != 0){
                    //this is place swap elements
                    int temp = nums[nonZeroIndex];
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = temp;
                    nonZeroIndex++;
                }

            }
            // //fill out zeros in remaining unfilled position
            // for(int j = nonZeroIndex; j < nums.length; j++){
            //     nums[j] = 0;
            // }
    }
    public static void main(String[] args) {

    }
}
