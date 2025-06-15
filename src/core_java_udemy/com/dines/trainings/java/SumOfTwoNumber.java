package core_java_udemy.com.dines.trainings.java;

import java.util.Scanner;

import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        out.println("Enter Two Integers");

        Scanner scanner = new Scanner(System.in);//take input from console

        int num1 = parseInt(scanner.next()); //parseInt static
        int num2 = parseInt(scanner.next());//hit enter or space then move to next numver

        int result = num1 + num2;
        out.println("Sum is: "+result);

        out.println("Sqrt"+ sqrt(36));
        out.println("Sqrt"+ pow(4,2));

    }
}
