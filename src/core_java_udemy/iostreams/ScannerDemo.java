package core_java_udemy.iostreams;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student id,name,score");
        int id = scanner.nextInt();
        String name = scanner.next();
        double score = scanner.nextDouble();
        System.out.println("Student Details");
        System.out.println("Id: "+id);
        System.out.println("name: "+name);
        System.out.println("score: "+score);
    }
}
