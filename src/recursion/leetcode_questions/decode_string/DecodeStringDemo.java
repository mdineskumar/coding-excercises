package recursion.leetcode_questions.decode_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DecodeStringDemo {
    public static String decodeString(String s){
        Stack<Integer> numberStack = new Stack();
        Stack<String> stringStack = new Stack();
        for(int i = 0; i < s.length();i++){
            int number = isNumeric(s.charAt(i));
            //check number is numeric if true then add that in to numberStack
            if(number != -1){
                numberStack.add(number);
                continue;
            }
            //need to process other elements
            if(String.valueOf(s.charAt(i)).equals("]")){
               //need to do innermost bracket and go back previous openbracket
               StringBuilder innerString = new StringBuilder();
               StringBuilder encodedString = new StringBuilder();
               String element = stringStack.pop();
               while(!element.equals("[")){
                   innerString.append(element);
                   element = stringStack.pop();

               }
               int numberOfTimes = numberStack.pop();
               for(int j = 0;j < numberOfTimes; j++){
                   encodedString.append(innerString);

               }
               stringStack.add(String.valueOf(encodedString));

            }else{
                stringStack.add(String.valueOf(s.charAt(i)));
            }




        }
        return stringStack.pop();
    }

    public static Integer isNumeric(char s){
        try{
            Integer number = Integer.parseInt(String.valueOf(s));
            return number;
        }catch (Exception e){
            return -1;
        }
    }
    public static void main(String[] args) {
        String s = "2[a3[c2[x]]y]";
        System.out.println("decoded string: "+decodeString(s));
    }
}
