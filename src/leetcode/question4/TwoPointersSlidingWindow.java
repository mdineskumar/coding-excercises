package leetcode.question4;

public class TwoPointersSlidingWindow {
    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 1){
            return 1;
        }
        if(s.isEmpty()){
            return 0;
        }
        int maxLength = 0;
        int l = 0;
        int r = 1;
        String subString = "";
        subString = s.substring(l,r);
        System.out.println("startpoint: "+subString);
        while(r < s.length()){
            while(s.substring(l,r).contains(String.valueOf(s.charAt(r)))){
                l = l+1;
            }
            if(!s.substring(l,r).contains(String.valueOf(s.charAt(r)))){
                maxLength = Math.max(maxLength,r-l+1);
            }
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
        System.out.println(lengthOfLongestSubstring(s4));




    }
}
