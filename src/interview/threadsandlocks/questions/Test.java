package interview.threadsandlocks.questions;

public class Test {
    public static void main(String[] args) {
        int n  = 100;
        Thread[] threads = {new FizzBuzzMultiThreaded(true,true,n,"FizzBuzz"),
        new FizzBuzzMultiThreaded(true,false,n,"Fizz"),
        new FizzBuzzMultiThreaded(false,true,n,"Buzz"),
        new NumberThread(false,false,n)};

        for( Thread thread : threads){
            thread.start();
        }
    }
}
