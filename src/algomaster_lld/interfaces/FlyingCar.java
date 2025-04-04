package algomaster_lld.interfaces;

//first interface
interface Flyable {
    void fly();
}
//second interface
interface Driveable {
    void drive();
}


public class FlyingCar implements Flyable, Driveable{

    @Override
    public void drive() {
        System.out.println("FlyingCar is flying...");
    }

    @Override
    public void fly() {
        System.out.println("FlyingCar is driving...");
    }
}