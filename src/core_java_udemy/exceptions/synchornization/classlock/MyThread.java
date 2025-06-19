package core_java_udemy.exceptions.synchornization.classlock;

public class MyThread extends Thread{
    String name;

    MyThread( String name){
        this.name = name;
    }

    @Override
    public void run() {
        DisplayMessage.sayHello(this.name);
    }
}
