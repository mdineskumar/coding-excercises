package interview.threadsandlocks.locks;

import interview.threadsandlocks.synchronization.staticmethods.MyObject;

public class MyClass extends Thread{
    LockedATM instance;
    String location;

    public MyClass(LockedATM lockedATM, String location){
        this.instance = lockedATM;
        this.location = location;
    }

    @Override
    public void run() {

    }
}
