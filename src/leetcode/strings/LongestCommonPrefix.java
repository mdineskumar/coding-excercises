package leetcode.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefixOptimized(String[] strs) {
        //sort the array
        Arrays.sort(strs);

        StringBuilder res = new StringBuilder();

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while(i < first.length() && first.charAt(i) == last.charAt(i)){
            res.append(first.charAt(i));
            i++;
        }

        return res.toString();


    }

    public String longestCommonPrefixHorizontalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        // Start with the prefix as the first string
        String prefix = strs[0];
        // Compare the chosen prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Find the common prefix between current prefix and strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character from the end each time
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        StringBuilder res = new StringBuilder();
        //starts with the prefix as the first string
        String startString = strs[0];


        for(int j = 0;j < startString.length();j++){
            boolean isAllEqual = true;
            //check index of j in each string
            for(int i = 1; i < strs.length; i++){
                if(j >= strs[i].length()){
                    return res.toString();
                }
                if(j < strs[i].length()
                        && startString.charAt(j) != strs[i].charAt(j)){
                    return res.toString();
                }
            }

//            if(isAllEqual ){
                res.append(startString.charAt(j));
//            }else{
//                return res.toString();
//            }

        }

        return res.toString();
    }
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefixOptimized(new String[]{"ab","a"}));
        System.out.println(longestCommonPrefix.longestCommonPrefixOptimized(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefixOptimized(new String[]{"dog","racecar","car"}));


    }
}
