package interview.threadsandlocks.questions;

public class NumberThread extends FizzBuzzMultiThreaded{

    public NumberThread(boolean div3, boolean div5, int max) {
        super(div3, div5, max, null);
    }

    public void print() {
        System.out.println(current);
    }

}
