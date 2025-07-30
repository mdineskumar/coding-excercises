package interview.threadsandlocks.synchronization.instancemethods;

public class Test {
    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyClass thread1 = new MyClass(obj1,"1");
        MyClass thread2 = new MyClass(obj1,"2");
        thread1.start();
        thread2.start();

//        MyObject obj = new MyObject();
//        MyClass thread
    }
}
