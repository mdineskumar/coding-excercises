package oop;

public class ConcreteClass {
    String instanceFieldString;
    int instanceFieldInt;

    static String staticFieldString;
    static int staticFieldInt;


    void instanceMethod(){
        String i = staticFieldString;
        staticMethod();
    }

    static void staticMethod(){
       // this.
        //int i = instanceFieldInt;
    }
}
