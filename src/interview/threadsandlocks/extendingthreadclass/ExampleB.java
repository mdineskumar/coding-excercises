package interview.threadsandlocks.extendingthreadclass;

public class ExampleB {
    public static void main(String[] args) {
        ThreadExample instance = new ThreadExample();
        instance.start();

        while(instance.count != 5){
            System.out.println(Thread.currentThread().getName() + " waiting...");
            try{
                Thread.sleep(250);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
}
