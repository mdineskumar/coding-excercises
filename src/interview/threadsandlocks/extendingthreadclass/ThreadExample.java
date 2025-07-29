package interview.threadsandlocks.extendingthreadclass;

public class ThreadExample extends Thread{
    public int count = 0;

    @Override
    public void run() {
        System.out.println("Thread starting...");
        try{
            while(count < 5){
                Thread.sleep(500);
                System.out.println("In thread, count is "+count);
                count++;
            }
        }catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread terminating...");

    }
}
