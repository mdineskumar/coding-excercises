package core_java_udemy.regular_expression;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[abc]","abc")); // a or b or c
        System.out.println(Pattern.matches("[abc]?","aa")); // a or b or c
        System.out.println(Pattern.matches("[abc]+","aa")); // a or b or c  1 or more than
        System.out.println(Pattern.matches("[abc]*","ddd")); // a or b or c  1 or more than

        //meta characters
        System.out.println(Pattern.matches("\\d","1")); // digit
        System.out.println(Pattern.matches("\\D","a1")); // digit
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}","test_")); // digit


    }
}
