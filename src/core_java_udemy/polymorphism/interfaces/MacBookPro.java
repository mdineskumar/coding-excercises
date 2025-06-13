package core_java_udemy.polymorphism.interfaces;

public class MacBookPro extends MacBook {
    @Override
    public void start(){
        System.out.println("inside mackbookpro start");
    }

    @Override
    public void shutdown(){
        System.out.println("inside mackbookpro shutdown");

    }

    public void proMethod(){
        System.out.println("inside specific pro methods");
    }
}
