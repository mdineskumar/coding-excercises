package core_java_udemy.exceptions.interrupt;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i am a lazy thread");

                Thread.sleep(2000);

        }
        } catch (InterruptedException e) {
            System.out.println("Got interruptedd");
        }

    }
}
