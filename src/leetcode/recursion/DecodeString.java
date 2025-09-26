package leetcode.recursion;


import java.util.Map;

public class DecodeString {
    public String decodeString(String s){
        char[] charArr = s.toCharArray();
        for(char c : charArr) {
            System.out.println(c);
        }
        return "";
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        ds.decodeString("3[a]2[bc]");


    }
}
