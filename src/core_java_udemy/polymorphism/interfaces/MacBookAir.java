package core_java_udemy.polymorphism.interfaces;

public class MacBookAir extends MacBook {
    @Override
    public void start(){
        System.out.println("inside mackbookair start");
    }

    @Override
    public void shutdown(){
        System.out.println("inside mackbookair shutdown");

    }
}
