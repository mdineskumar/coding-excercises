package core_java_udemy.mutlithreading;

public class MutliThreaded extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            System.out.print("running thread: "+Thread.currentThread().getName()+": "+ "i: "+i+"\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("child thread exiting");
            }
        }
    }

    public static void main(String[] args) {
        MutliThreaded mt = new MutliThreaded();
        mt.start();

        for (int j = 0; j <= 200; j++) {
            System.out.print("j: "+j+"\t");
        }
    }
}
