package core_java_udemy.iostreamsecond;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        System.out.println("Enter Numbers to calculate sum: ");
        while(scanner.hasNextLong()){
            long i = scanner.nextLong();
            result += i;
        }

        System.out.println("Total sum is: "+result);
    }
}
