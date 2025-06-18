package core_java_udemy.mutlithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum = 0;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Sum of first 'N' numbers");
        System.out.println("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        JoinDemo.n = scanner.nextInt();
        System.out.println("Start calculation....");
        JoinDemo jd = new JoinDemo();
        jd.start();
        //only second thread finished need to execute
        try {
            jd.join();
        } catch (InterruptedException e) {
            System.out.println("CHild thread exiting");
        }
        System.out.println("Sum of first "+JoinDemo.n + " Numbers is: "+JoinDemo.sum);
        long end = System.currentTimeMillis();

        System.out.println("Total time: "+(end - start) / 1000 + " seconds");
    }

    @Override
    public void run() {
        for (int i = 1; i <= JoinDemo.n; i++) {
               JoinDemo.sum += i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
