package interview.threadsandlocks.synchronization.synchronizedblocks;

public class MyClass extends Thread{
    String name;
    MyObject myObj;
    @Override
    public void run() {
        myObj.foo(name);
    }
}
