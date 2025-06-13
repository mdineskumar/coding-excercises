package core_java_udemy.polymorphism.interfaces;

public class RunTimeBinding {
    public static void main(String[] args) {
        AppleLaptop m1 = new MacBookPro();//upcasting //jvm does it
        AppleLaptop m2 = new MacBookAir();


        m1.start();
        m1.shutdown();
        //m1.proMethod();//when specific to child classes cant use Parent reference
        MacBookPro m3  = (MacBookPro) m1; //downcasting
        m3.proMethod();//when specific to child classes
        m2.start();
        m2.shutdown();
        MacBookAir m4 = (MacBookAir) m2;//downcasting //when specific to child classes

    }
}
