package leetcode;

import java.util.Arrays;

public class medianSortedArray {
    public static double medianIndex(int[] arr){
        int n = arr.length;
        double median = 0;
        if(n % 2 == 0){
            //n is even
            int first = (int) (n/2.0) - 1;
            int second = (int) ((n/2.0) +1) - 1;
            if(first < n && second < n){
                median = (arr[first] + arr[second]) / 2.0;
            }
        }else{
            //n is odd
            int element = (int) ((n+1)/2.0) - 1;
            if(element < n){
                median = arr[element];
            }

        }

        return median;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ;
        int n = nums2.length ;
        int[] mergedArray = new int[m+n];
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;



        while(ptr1 < m && ptr2 < n){
            if(nums1[ptr1] < nums2[ptr2]){
                mergedArray[ptr3] = nums1[ptr1];
                ptr3++;
                ptr1++;
            }else{
                mergedArray[ptr3] = nums2[ptr2];
                ptr3++;
                ptr2++;
            }
        }

        while(ptr1 < m){

                mergedArray[ptr3] = nums1[ptr1];
                ptr3++;
                ptr1++;

        }

        while(ptr2 < n){

            mergedArray[ptr3] = nums2[ptr2];
            ptr3++;
            ptr2++;

        }

        System.out.println(Arrays.toString(mergedArray));


        System.out.println("Median element of mergedArray: "+medianIndex(mergedArray));
        return medianIndex(mergedArray);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2,4,5};
        double median =  findMedianSortedArrays(nums1,nums2);

        System.out.println("median of the merged array: "+median);




    }

}
