package interview.threadsandlocks.synchronization.synchronizedblocks;

public class MyObject {
    int count = 0;
    public void foo(String name) {
        synchronized (this){
            //only one thread can execute this block at a time

            count++;
        }

    }
}
