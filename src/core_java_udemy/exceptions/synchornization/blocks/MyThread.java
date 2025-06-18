package core_java_udemy.exceptions.synchornization.blocks;

public class MyThread extends Thread{
    String name;
    DisplayMessage dm;

    MyThread(DisplayMessage dm, String name){
        this.name = name;
        this.dm = dm;
    }

    @Override
    public void run() {
        dm.sayHello(this.name);
    }
}
