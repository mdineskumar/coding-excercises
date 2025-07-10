package core_java_udemy.generics;

public class MethodLevelGeneric {

    public <T> void method(T t){

    }

    public <T extends Runnable> void method2(T t){

    }

    public <T extends Runnable&Comparable<String>> void method3(){

    }



}
