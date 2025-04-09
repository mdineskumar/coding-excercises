package algomaster_lld.polymorphism;

public class vehicledemo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.start();

        myVehicle = new Bike();
        myVehicle.start();

    }
}

interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("car is starting....");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("bike is starting....");
    }
}


