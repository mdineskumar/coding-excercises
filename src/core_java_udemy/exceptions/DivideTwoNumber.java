package core_java_udemy.exceptions;

import java.util.Scanner;

public class DivideTwoNumber {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        try{
            c = a / b;
            System.out.println("Result is: "+c);
        }
        //cant use without these catch
        //problem if there are exceptions
        catch (ArithmeticException e){
            System.out.println("Please dont enter 0");
        }
        finally {
            System.out.println("inside finally");
            //get executed always
            //resource closing statements
        }


        System.out.println("Nore code come here");
    }
}
