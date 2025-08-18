package leetcode.arrays;

public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if(i < j
                            && j < k
                            && nums[i] < nums[j]
                            && nums[j] < nums[k]){
                        System.out.println("i: "+i+" j: "+j+" k: "+k);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean increasingTripletOptimized(int[] nums) {
        //we have to find a < b < c
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int num: nums){
            if(num <= a){
                a = num;
            } else if (num <= b) {
                b = num;
            }else{
                //we found number that greater that a < b
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTripletSubsequence tripletSubsequence = new IncreasingTripletSubsequence();
        System.out.println(tripletSubsequence.increasingTriplet(new int[]{1,2,3,4,5,6}));
        System.out.println(tripletSubsequence.increasingTriplet(new int[]{2,1,5,0,4,6}));

    }
}

