package backtracking;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class Permutation {

     public static void permutationBacktracking(int[] a){
         int n = a.length;
         int k = n;
         int depth = 0;
         boolean[] used = new boolean[n];
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        A_n_k(a,n,k,depth,used,curr,ans);
         System.out.println("ALl permutation: "+ans);

     }
     private static void A_n_k(int[] a, int n, int k, int depth, boolean[] used, List<Integer> curr, List<List<Integer>> ans){
        //implementation permutation of k items out of n items
        //depth: start from 0, and represent the depth of the search
        //used: track what items are in the partial solution from the set of n
        //curr: the current partial solution
        //ans collect all the validate solutions

         // base condition
        if (depth == k){
            //TODO: use deep copy to and solution
            //ans.append(curr[::])
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < n; i++){
            if(!used[i]){
                //generate the next solution from curr
                //curr.append(a[i])
                curr.add(a[i]);
                //TODO: java implementation for this
                used[i] = true;
                System.out.println(curr);
                //mode to next solution
                A_n_k(a,n,k,depth+1,used,curr,ans);

                //backtrack to previous partial state
                //curr.pop()
                curr.remove(curr.size() - 1);
                System.out.println("backtrack: "+curr);
                //TODO: java implementation for this
                used[i] = false;
            }
        }


    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        permutationBacktracking(a);
    }
}
