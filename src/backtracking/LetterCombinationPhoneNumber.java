package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2',"abc");
        mapping.put('3',"def");
        mapping.put('4',"ghi");
        mapping.put('5',"jkl");
        mapping.put('6',"mno");
        mapping.put('7',"pqrs");
        mapping.put('8',"tuv");
        mapping.put('9',"wxyz");
        List<Character> remainingDigits = new ArrayList<>();
        List<String> rst = new ArrayList<>();
        for(char c: digits.toCharArray()){
            remainingDigits.add(c);
        }
        return solve(remainingDigits,mapping,rst);
    }
    private static List<String> solve( List<Character> remainingDigits, Map<Character,String> mapping, List<String> rst){
        if(remainingDigits.isEmpty()){
           return rst;
        }
        if(rst.isEmpty()){
            rst.add("");
        }
        //to prepare partial solutions
        List<String> next_rst = new ArrayList<>();
        //remove digits from remaining digits. that mapping strings add into partial solutions
        Character digits = remainingDigits.remove(0);
        for(String s: rst){
            //get string for digits from mapping hashtable
            String mappingStr = mapping.get(digits);
            //convert string into char array
            char[] mappingStrArr = mappingStr.toCharArray();
            //loop through all the mapping string
            // added into the each previous partial soultions string (r+c)

            for(char c: mappingStrArr){
                // add in next result(partial solutions)
                next_rst.add(s+c);
            }

        }
        return solve(remainingDigits,mapping,next_rst);

    }
    public static void main(String[] args) {
        letterCombinations("23");
    }
}
