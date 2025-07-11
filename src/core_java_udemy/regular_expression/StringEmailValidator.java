package core_java_udemy.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEmailValidator {
    public static void main(String[] args) {
        String email = "bharath@bharath.com";
        if(email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")){

            System.out.println("valid email id");
        }
        else{
            System.out.println("invalid email");
        }



    }
}
