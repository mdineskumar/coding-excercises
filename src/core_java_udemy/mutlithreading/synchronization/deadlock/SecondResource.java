package core_java_udemy.mutlithreading.synchronization.deadlock;

public class SecondResource {

    public synchronized void method1(FirstResource fr){
        System.out.println("Inside of method1 of SR");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Invoking of method2 of SR");
        fr.method2();
    }

    public synchronized void method2(){
        System.out.println("Inside of method2 of SR");

    }

}
