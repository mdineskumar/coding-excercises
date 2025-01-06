package datastructure.arrays;

public class Solution {
    public static boolean isUniqueChars(String str){
        if (str.length() > 128) return false;
        boolean[] chars = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(chars[val]){
                return false;
            }
            chars[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "Uniquee";
        System.out.println("word: " + word+ " has unique chars: " + isUniqueChars(word));
    }
}
