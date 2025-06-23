package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void c_n_k(int[] a, int n, int k, int start, int depth, List curr, List<List<Integer>> ans){
        if (depth == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < n; i++) {
            //generate the next solution from curr
            curr.add(a[i]);
            System.out.println(curr);
            //move to next solution
            c_n_k(a,n,k,i+1,depth+1,curr,ans);
            //backtrack to previous partial state
            curr.remove(curr.size() - 1);
            System.out.println("backtrack: "+curr);
        }
        return;

    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int n = a.length;
        List<List<Integer>> ans = new ArrayList<>();
        c_n_k(a,n,2,0,0,new ArrayList<Integer>(),ans);
        System.out.println(ans);
    }
}
