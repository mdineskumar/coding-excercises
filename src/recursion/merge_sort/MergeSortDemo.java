package recursion.merge_sort;

import java.util.Arrays;

public class MergeSortDemo {
    public static int[] mergeSort(int[] lst){
        if(lst.length == 0){
            return new int[]{};
        }
        return mergeSort(0,lst.length-1,lst);
    }
    public static int[] mergeSort(int lo, int hi, int[] lst){
        //base condition
        if (lo == hi){
            return new int[]{lst[lo]};
        }
        int mid = (lo + hi)/2;
        int[] left = mergeSort(lo,mid,lst);
        int[] right = mergeSort(mid+1,hi, lst);

        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right){
        int[] sortedList = new int[left.length+right.length];
        int l = 0;
        int r = 0;
        int e = 0;

        while( l != left.length || r != right.length){
            if(l == left.length){
                sortedList[e] = right[r];
                e++;
                r++;
            }else if(r == right.length){
                sortedList[e] = left[l];
                e++;
                l++;
            }else if( left[l] < right[r]){
                sortedList[e] = left[l];
                e++;
                l++;
            }else{
                //left[l] >= right[r]
                sortedList[e] = right[r];
                e++;
                r++;
            }

        }
        System.out.println("left: "+ Arrays.toString(left)+", right: "+ Arrays.toString(right) +" sorted: "+ Arrays.toString(sortedList));
        return sortedList;
    }
    public static void main(String[] args) {
       int[] unsortedList = new int[]{9,7,5,6,2,4};
       int[] sortedList = mergeSort(unsortedList);
        System.out.println("sorted: "+ Arrays.toString(sortedList));
    }
}
