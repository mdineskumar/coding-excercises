package algomaster_lld.interfaces;

interface Animal{
    void sound();
    //default method with implementation
    default void sleep(){
        System.out.println("sleeping");
    }
}
public class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
