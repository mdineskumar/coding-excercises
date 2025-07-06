package core_java_udemy.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNoValidator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{10}$]");//^starts with $ ends with
        Matcher matcher = pattern.matcher("1234567890");
        if(matcher.matches()){
            System.out.println("valid phone numver");
        }
        else{
            System.out.println("invalid phone number");
        }



    }
}
