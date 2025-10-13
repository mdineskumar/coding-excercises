package core_java_udemy.iostreamsecond;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student id, name, test score: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        double score = scanner.nextDouble();

        System.out.println("Student Detials");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Score: "+score);

    }
}
