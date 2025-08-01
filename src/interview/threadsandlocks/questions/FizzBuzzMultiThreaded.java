package interview.threadsandlocks.questions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzMultiThreaded extends Thread {

    private int n;
    protected static  int current = 1;
    private static Object lock = new Object();
    private int max;
    private boolean div3, div5;

    private String toPrint;

    public FizzBuzzMultiThreaded(boolean div3, boolean div5, int max, String toPrint){
        this.div3 = div3;
        this.div5 = div5;
        this.max = max;
        this.toPrint = toPrint;
    }

    public void print(){
        System.out.println(toPrint);
    }

    @Override
    public void run() {
        while(true){
            synchronized (lock){
                if(current > max) {
                    return;
                }

                if((current % 3 == 0) == div3 && (current % 5 == 0) == div5){
                    print();
                    current++;
                }
            }
        }
    }

}
