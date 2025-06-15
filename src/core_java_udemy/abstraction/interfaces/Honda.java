package core_java_udemy.abstraction.interfaces;

public class Honda implements Car{
    @Override
    public void go() {
        System.out.println("inside honda go");
    }

    @Override
    public void stop() {
        System.out.println("inside honda stop");

    }
}
