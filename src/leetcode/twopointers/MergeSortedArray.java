package leetcode.twopointers;

import java.util.Arrays;

public class MergeSortedArray {

    //in-place two-pointer technique
    public static void mergeOptimal(int[] nums1, int m, int[] nums2, int n) {
        //merge starting from the backward
        //to avoid overwriting values
        int p1 = m - 1, p2 = n-1, p=m+n-1;

        while (p1>= 0 && p2 >=0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p--;
                p1--;

            } else {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }

        //if there are any remaining elements in nums2
        while(p2>=0){
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }


//        //what if nums2 array not fully processed
//        while(j < n){
//            res[k] = nums2[j];
//            k++;
//            j++;
//        }

//        //what if nums1 array not fully processed
//        while(i < m){
//            res[k] = nums1[i];
//            i++;
//            k++;
//        }
//
//        //copy res array into nums1
//        for (int l = 0; l < m+n; l++) {
//            nums1[l] = res[l];
//        }


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        if (n == 0) {return;}
        int i = 0, j = 0, k=0;

        while (i < m && j < n && k < m+n) {
            if (nums1[i] > nums2[j]) {
                res[k] = nums2[j];
                k++;
                j++;
            } else {
                res[k] = nums1[i];
                k++;
                i++;
            }
        }

        //what if nums2 array not fully processed
        while(j < n){
            res[k] = nums2[j];
            k++;
            j++;
        }

        //what if nums1 array not fully processed
        while(i < m){
            res[k] = nums1[i];
            i++;
            k++;
        }

        //copy res array into nums1
        for (int l = 0; l < m+n; l++) {
            nums1[l] = res[l];
        }


    }

    public static void main(String[] args) {
        //int[] nums1 = {4,5,6,0,0,0};
//        int[] nums2 = {1,2,3};
//        int[] nums1 = {4,0,0,0,0,0};
//        int[] nums2 = {1,2,3,5,6};
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1, 1, nums2, 1);
        System.out.println(Arrays.toString(nums1));

    }
}
