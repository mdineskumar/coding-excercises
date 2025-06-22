package core_java_udemy.innerclasses.anonymousinnerclasses;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable Inner Class");
            }
        });
        t.start();
    }
}
