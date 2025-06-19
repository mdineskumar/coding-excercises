package core_java_udemy.mutlithreading.synchronization.classlevel;

public class MyThread extends Thread{
    //DisplayMessage dm;
    String name;

    MyThread(String name){
       //this.dm = dm;
       this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread: "+Thread.currentThread().getName() + " executing!");
         DisplayMessage.sayHello(this.name);
    }
}
