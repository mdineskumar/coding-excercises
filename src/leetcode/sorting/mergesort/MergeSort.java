package leetcode.sorting.mergesort;

import java.util.Arrays;

public class MergeSort {

    public void merge(int[] arr, int l, int m, int r){
        //1. create temp arrays that holds left and right subarrays
        int nL = m-l+1;
        int nR = r-m;
        int[] L = new int[nL];
        int[] R = new int[nR];

        //2. copy left and right
        for(int i=0;i<nL;i++){
            L[i] = arr[l+i];
        }
        for(int j = 0; j < nR; j++) {
            R[j] = arr[m+1+j];
        }

        //3. two pointers to left array and right array
        int p1 = 0;
        int p2 = 0;


        int k = l;

        while(p1 < nL && p2 < nR){
            if(L[p1] <= R[p2]){
                arr[k] = L[p1];
                k++;
                p1++;
            }else{
                arr[k] = R[p2];
                k++;
                p2++;
            }
        }

        //if any remain in left or right
        while(p1 < nL){
            arr[k] = L[p1];
            p1++;
            k++;
        }

        while(p2 < nR){
            arr[k] = R[p2];
            p2++;
            k++;
        }

    }

    public void mergeSort(int[] arr, int l, int r) {
        //divide
        if(l < r){
            int m = l + (r - l)/2 ;
            mergeSort(arr,l, m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {8,9,3,1,4,5};
        ms.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
