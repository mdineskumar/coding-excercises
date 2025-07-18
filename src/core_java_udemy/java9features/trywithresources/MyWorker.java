package core_java_udemy.java9features.trywithresources;

public class MyWorker implements AutoCloseable{
    public MyWorker() {
        System.out.println("Creating the resource");
    }

    public void doSomething() {
        System.out.println("Doing something!");

    }


    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");

    }
}
