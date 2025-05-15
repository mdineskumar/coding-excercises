package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> rst = new ArrayList<>();
        dfs(new ArrayList<>(),0,rst,nums);
        return rst;
    }

    private static void dfs(List<Integer> temp, int idx, List<List<Integer>> rst, int[] nums){
        rst.add(new ArrayList<>(temp)); // copy of temp
        for(int i = idx;i < nums.length;i++){
            temp.add(nums[i]);
            dfs(temp,idx+1,rst,nums);
            temp.remove(temp.size() - 1);
            System.out.println("backtrack: "+temp);
        }
    }
    public static void main(String[] args) {
     int[] nums = new int[]{1,2,3};
     subsets(nums);
    }
}
