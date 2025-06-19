package core_java_udemy.exceptions;

public class StringParser {
    public static void main(String[] args) {
        String s = "abcd";
        try{
            Integer i = Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("string should be a number");
        }

    }
}
