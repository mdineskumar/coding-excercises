package interview.threadsandlocks.synchronization.instancemethods;

public class MyClass extends Thread{
    private String name;
    private MyObject myObj;

    public MyClass(MyObject myObj, String n){
        this.name = n;
        this.myObj = myObj;
    }

    @Override
    public void run() {
        myObj.foo(name);
    }


}
