package core_java_udemy.mutlithreading.synchronization.deadlock;

public class FirstResource {

    public  void method1(SecondResource sr){
        System.out.println("Inside of method1 of FR");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Invoking of method2 of SR");
        sr.method2();
    }

    public synchronized void method2(){
        System.out.println("Inside of method2 of FR");

    }

}
