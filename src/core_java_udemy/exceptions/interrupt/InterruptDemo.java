package core_java_udemy.exceptions.interrupt;

public class InterruptDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        //t.interrupt();

        System.out.println("end of main method");
    }
}
