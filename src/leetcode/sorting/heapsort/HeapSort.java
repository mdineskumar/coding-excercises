package leetcode.sorting.heapsort;

import java.util.Arrays;

public class HeapSort {
    public static void heapify(int[] arr, int n, int i) {
        //check left and right child
        //assume largest in root
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        //change larggest if l or r larger that current rooted element
        if(l<n && arr[largest] < arr[l]){
            largest = l;
        }

        if(r < n && arr[largest] < arr[r]) {
            largest = r;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            System.out.println(Arrays.toString(arr));
            //rearrange affected subtree
            heapify(arr,n,largest);
        }
        //then take larger element and swap it with current element
        //repeat the process to swapped child element

    }


    public static void heapSort(int[] arr){
        int n = arr.length;
        //1. create max heap using heapify
        for(int i = n/2-1; i >= 0;i--){
            heapify(arr, n, i);
        }

        //2. swap root element with last heap element and heapify
        //while there is nonly one element left in heap

        //one by one get root element and swap
        for(int i = n-1; i >0;i--){
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            //call max heap heapify
            heapify(arr,i,0);
        }


    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 8, 10, 2, 5};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
