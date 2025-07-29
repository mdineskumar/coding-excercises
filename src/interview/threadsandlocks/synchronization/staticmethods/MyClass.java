package interview.threadsandlocks.synchronization.staticmethods;


public class MyClass extends Thread{
    private String name;
    private MyObject myObj;

    public MyClass(MyObject myObj, String n){
        this.name = n;
        this.myObj = myObj;
    }

    @Override
    public void run() {
        if ( name.equals("1")) MyObject.foo(name);
        else if (name.equals("2")) MyObject.bar(name);
    }
}
