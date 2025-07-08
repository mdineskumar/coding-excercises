package leetcode.strings;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t){
        //subsequence new string formed from the original string by deleteing some of the characters
        //without disturbing relative positions of remaining characters

        int prevMatchedIndex = -1;
        for(int i = 0; i< s.length();i++){
            int res = t.indexOf(s.charAt(i));
            if(res == -1){
                return false;
            }
            if(prevMatchedIndex <= res){
                prevMatchedIndex = res;
            }else{
                return false;
            }

        }
        return true;

    }

    public static boolean isSubsequenceTwoPointers(String s, String t){
        int i = 0;
        int j = 0;
//        int previousMatchedIndex = -1;
        while(i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)) {
                //if(previousMatchedIndex <= j){
                  //  previousMatchedIndex = j;
                    i++;
                    j++;
                //}else{
                  //  return false;
                //}
            }else{
                j++;
            }

        }
        return (i == s.length());
    }

    public static void main(String[] args) {
        System.out.println(IsSubsequence.isSubsequenceTwoPointers("abc","ahbgdc"));
        System.out.println(isSubsequenceTwoPointers("axc","ahbgdc"));
        System.out.println(isSubsequenceTwoPointers("aaaaaa","bbaaaa"));
    }
}
