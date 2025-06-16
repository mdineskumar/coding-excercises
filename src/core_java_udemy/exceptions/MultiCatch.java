package core_java_udemy.exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            String input = args[0];
            System.out.println("input is: "+input);
            int output = Integer.parseInt(input);
            System.out.println("output is: "+output);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("input is required");
        }catch (NumberFormatException e){
            System.out.println("invalid input provided");
        }
        finally {
            System.out.println("inside finally");
            //get executed always
            //resource closing statements
        }
        System.out.println("more code can go here!");
    }
}
