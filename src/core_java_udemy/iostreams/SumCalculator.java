package core_java_udemy.iostreams;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        System.out.println("Enter Number to calculate sum: ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        //depending on the data type
        //only int
        //if string then while loop ends
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("SUm is: "+sum);
    }
}
