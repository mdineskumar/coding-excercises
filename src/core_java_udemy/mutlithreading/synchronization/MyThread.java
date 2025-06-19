package core_java_udemy.mutlithreading.synchronization;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;

    MyThread(DisplayMessage dm, String name){
       this.dm = dm;
       this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread: "+Thread.currentThread().getName() + " executing!");
         dm.sayHello(this.name);
    }
}
