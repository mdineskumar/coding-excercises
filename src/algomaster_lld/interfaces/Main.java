package algomaster_lld.interfaces;

public class Main  {
    public static void main(String[] args) {
        Vehicle myCar = new Car();//polymorphism: Interface inference
        myCar.start();
        myCar.stop();

        FlyingCar myVehicle = new FlyingCar();
        myVehicle.fly();
        myVehicle.drive();

        Dog myDog = new Dog();
        myDog.sound();
        myDog.sleep();//calling default method

        int result = MathOperations.add(5,3);
        System.out.println("Sum: "+result);

        Payment payment1 = new CreditCardPayment();
        payment1.pay(100.5);

        Payment payment2 = new PaypalPayment();
        payment2.pay(200.57);

    }
}
