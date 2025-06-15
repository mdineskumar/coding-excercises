package core_java_udemy.polymorphism.runtimebinding;

public class RunTimeBinding {
    public static void main(String[] args) {
        MacBook m1 = new MacBookPro();
        MacBook m2 = new MacBookAir();
        m1.start();
        m1.shutdown();
        m2.start();
        m2.shutdown();
    }
}
