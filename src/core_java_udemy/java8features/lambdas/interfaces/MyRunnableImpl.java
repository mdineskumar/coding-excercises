package core_java_udemy.java8features.lambdas.interfaces;

public class MyRunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
        }
    }
}
