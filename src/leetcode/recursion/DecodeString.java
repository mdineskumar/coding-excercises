package leetcode.recursion;


import java.util.Map;

public class DecodeString {
    //global for tracking current position
    private int index = 0;

    public void solve(StringBuilder sb, int repeats, String str) {
        if (repeats == 0) {
            return;
        }
        sb.append(str);
        //hypothesis
        solve(sb, repeats-1, str);
    }

    public String decodeString(String s){
        StringBuilder result = new StringBuilder();

        //iterate string until find the close  brackets
        while(index < s.length() && s.charAt(index) != ']') {
            char currentChar = s.charAt(index);
            //if it digit then i need to go to ineer
            // 2[a3[c2[x]]y]
            if(Character.isDigit(currentChar)){
                int k = 0;
                //decode the multiplier: what happen if it 100 or 1212 multiple digits
                while(index < s.length() && Character.isDigit(s.charAt(index))) {
                    k = k * 10 + (s.charAt(index) - '0');
                    index++;
                }

                //now if we found '[' then decode string recursively like current position
                index++;
                //hypothesis when we found open brackets it will return decoded string for inside string a3[c2[x]]y ==>
                String  decodedString = decodeString(s);
                // repeat the decoded string as required
                while(k > 0) {
                    result.append(decodedString);
                    k--;
                }

                //at this point the index would have moved past ']'
                index++;
            }else{
                //add letters directly to the result
                result.append(currentChar);
                index++;
            }

            // it is letter
            // it is open bracket
            //it is close bracket
        }

        return result.toString();
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        System.out.println(ds.decodeString("3[a]2[bc]"));


    }
}
