package core_java_udemy.java8features.lambdas.anonymous;

public class Test {

    public static void lambda(){
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread 1");
            }
        });
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread2");
        }
    }
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("child thread");
                }
            }
        });

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }

        lambda();



    }

}
