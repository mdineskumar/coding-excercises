package oop.lecture9;

public class PausingThreadExecution {
    public static void main(String[] args) throws InterruptedException {
        String myNumbers[] = {"1", "2", "3", "4"};

        for (int i = 0; i < myNumbers.length; i++) {
            Thread.sleep(4000);
            System.out.println(myNumbers[i]);
        }
    }
}
