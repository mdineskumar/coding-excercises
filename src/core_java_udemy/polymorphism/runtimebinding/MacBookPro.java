package core_java_udemy.polymorphism.runtimebinding;

public class MacBookPro extends MacBook {
    @Override
    void start(){
        System.out.println("inside mackbookpro start");
    }

    @Override
    void shutdown(){
        System.out.println("inside mackbookpro shutdown");

    }
}
