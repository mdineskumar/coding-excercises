package interview.threadsandlocks.locks;

import interview.threadsandlocks.extendingthreadclass.ThreadExample;

public class Test {
    public static void main(String[] args) {
        LockedATM atm = new LockedATM();

        Thread depositThread1 = new Thread(() -> {
            System.out.println("Deposit 50:" + atm.deposit(50));
        });

        Thread depositThread2 = new Thread(() -> {
            System.out.println("Deposit 100:" + atm.deposit(100));
        });

        Thread withdrawThread1 = new Thread(() -> {
            System.out.println("Withdraw 30: "+atm.withdraw(30));
        });

        Thread withdrawThread2 = new Thread(()->{
            System.out.println("WIthdraw 70: "+atm.withdraw(70));
        });

        //start all threads
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        // Wait for all threads to finish
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance (expected 100 + 50 + 100 - 30 - 70 = 150): " + atm.withdraw(0));



    }
}
