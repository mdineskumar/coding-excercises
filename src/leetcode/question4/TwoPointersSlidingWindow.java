package leetcode.question4;

import java.util.HashMap;
import java.util.Map;

public class TwoPointersSlidingWindow {
    public static int lengthOfLongestSubstring(String s){
        int maxLength = 0;
        int l = 0;
        int r = 0;
        Map hash = new HashMap();

        while(r < s.length()){
            if(hash.get(s.charAt(r)) != null){

                if((int) hash.get(s.charAt(r)) >= l ){
                    l = (int) hash.get(s.charAt(r)) + 1;
                    maxLength = Math.max(maxLength,r-l+1);
                    hash.put(s.charAt(r),r);
                }

            }
            //if(hash.get(s.charAt(r)) == null){
                maxLength = Math.max(maxLength,r-l+1);
                hash.put(s.charAt(r),r);
            //}

            r++;
            System.out.println(s.substring(l,r));
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = " ";
        String s5 = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s5));




    }
}
