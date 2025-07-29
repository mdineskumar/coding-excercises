package leetcode.strings;

public class ValidPalindrome {
    public boolean isPalindromeOptimize(String s){

        StringBuilder cleaned = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        System.out.println(cleaned.toString());
        String check = cleaned.toString();

        int l = 0, r=cleaned.length() -1;
        while(l < r){
            if(cleaned.charAt(l) != cleaned.charAt(r)){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
    public boolean isPalindrome(String s){
        //convert all letters to lowercase letters
        String lowerCaseStr = s.toLowerCase();
        System.out.println(lowerCaseStr);
        //removing all non-alphanumeric characters
        //a-zA-Z0-9
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<lowerCaseStr.length();i++){
            char c = lowerCaseStr.charAt(i);
            if(alphaNumeric.indexOf(c) != -1){
                sb.append(c);
            }

        }
        System.out.println(sb.toString());
        String check = sb.toString();

        int l = 0, r=check.length() -1;
        while(l < r){
            if(check.charAt(l) != check.charAt(r)){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(vp.isPalindrome("race a car"));
        System.out.println(vp.isPalindrome(" "));

    }
}
