package core_java_udemy.java8features.lambdas.interfaces;

public class Test {
    public static void main(String[] args) {
        //Runnable r = new MyRunnableImpl();
        //Thread t = new Thread(r);
        //t.start();

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
