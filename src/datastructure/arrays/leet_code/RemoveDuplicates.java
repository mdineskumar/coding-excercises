package datastructure.arrays.leet_code;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int unique = 1;
        int next_ptr = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[next_ptr]){
                next_ptr++;
                nums[next_ptr] = nums[i];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
