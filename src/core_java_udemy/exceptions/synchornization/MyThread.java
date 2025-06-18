package core_java_udemy.exceptions.synchornization;

import designpattern.factory.assignment.Person;
import designpattern.observer.DisplayElement;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;

    MyThread(DisplayMessage dm, String name){
        this.dm =dm;
        this.name = name;
    }

    @Override
    public void run() {
        dm.sayHello(this.name);
    }
}
