package leetcode.question13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map romanToInteger = new HashMap();
        romanToInteger.put('I',1);
        romanToInteger.put('V',5);
        romanToInteger.put('X',10);
        romanToInteger.put('L',50);
        romanToInteger.put('C',100);
        romanToInteger.put('D',500);
        romanToInteger.put('M',1000);

        char[] charArray = s.toCharArray();
        int lengthArray = charArray.length;
        int result = 0;
        int prevDigit =  (int)romanToInteger.get(charArray[lengthArray - 1]);
        for(int i = lengthArray - 1; i >= 0; i--){
            int digit = (int) romanToInteger.get(charArray[i]);
            if(prevDigit > digit){
                result -= digit;
                prevDigit = digit;
                continue;
            }
            result += digit;
            prevDigit = digit;

        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}
