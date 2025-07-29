package interview.threadsandlocks;

public class RunnableThreadExampleDemo {
    public static void main(String[] args) {
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread thread = new Thread(instance);
        thread.start();

        //waits until above thread counts to 5 slowly
        while(instance.count != 5){
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
