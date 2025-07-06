package core_java_udemy.regular_expression;

import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
//        Pattern compile = Pattern.compile("\\s");
        Pattern compile = Pattern.compile("[.]");
        String[] words = compile.split("www.dineskumarmuruges.com");

        String s = "www.dinesluar.com";
        String[] words2 = s.split("[.]");
        for (String word: words2){
            System.out.println(word);
        }

    }
}
