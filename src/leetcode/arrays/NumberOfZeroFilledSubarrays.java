package leetcode.arrays;

public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubArray(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++) {

            for(int j = 0; j < nums.length ;j++){
                int r = j + i;
                if( r > nums.length){
                    break;
                }
                if(isZeroFilledSubArr(j,r,nums)){
                    count++;
                }

            }

        }
        return count;
    }
    public long zeroFilledSubarrayQuart(int[] nums){
        long count = 0;
        int n = nums.length;

        // Check each subarray starting at index `i`
        for (int i = 0; i < n; i++) {
//            // Track contiguous zeroes starting from index `i`
//            for (int j = i; j < n && nums[j] == 0; j++) {
//                // Increment count each time a zero-filled subarray is found
//                count++;
//            }
            int j = i;
            while(j<n && nums[j] == 0) {
                j++;

                count++;
            }

        }
        return count;
    }



    public boolean isZeroFilledSubArr(int l, int r, int[] nums){
        int current = l;
        //loop through sliding window
        while(current <= r) {
            if(current > nums.length - 1){
                return false;
            }
            if(nums[current] != 0){
                return false;
            }
            current++;
        }
        return true;
    }

    public long zeroFilledSubarrLinearScan(int[] nums){
        int zeroCount = 0;
        long result =0;

        for(int num: nums){
            //check if the current number is 0
            if(num == 0){
                //extend current zero sequence
                zeroCount++;
            }else{
                //calculate subarrays for the zero sequence
                //get number of subarrays for segments for contigous zeroes
                result += zeroCount * (zeroCount+1L) /2;
                //reset the zero sequence counter
                zeroCount = 0;
            }
        }
        //if all arrays are zeros or last contigous zeroes segment end with array end
        result += zeroCount * (zeroCount+1L) /2;

        return result;
    }

    public static void main(String[] args) {
        NumberOfZeroFilledSubarrays nzfs = new NumberOfZeroFilledSubarrays();
        System.out.println(nzfs.zeroFilledSubarrLinearScan(new int[]{1,3,0,0,2,0,0,4}));
        System.out.println(nzfs.zeroFilledSubarrLinearScan(new int[]{0,0,0,2,0,0}));


    }
}
