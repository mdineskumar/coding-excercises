package core_java_udemy.polymorphism.runtimebinding;

public class MacBookAir extends MacBook{
    @Override
    void start(){
        System.out.println("inside mackbookair start");
    }

    @Override
    void shutdown(){
        System.out.println("inside mackbookair shutdown");
    }
}
