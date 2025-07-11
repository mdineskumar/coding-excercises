package core_java_udemy.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");//^starts with $ ends with
        Matcher matcher = pattern.matcher("test@gmail.com");
        if(matcher.matches()){
            System.out.println("valid email id");
        }
        else{
            System.out.println("invalid email");
        }



    }
}
