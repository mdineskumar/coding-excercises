package core_java_udemy.inheritance.hierarchical_heritance;

import core_java_udemy.access_modifiers.p2.C;

public class OverridingTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.fuel());

        Bike bike = new Bike();
        System.out.println(bike.fuel());
    }
}
