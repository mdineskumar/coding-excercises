package core_java_udemy.objectmethods;

public class Test {

    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        passenger.setFirstName("Bharath");
        passenger.setLastName("DInes");
        passenger.setId(10);

        Passenger passenger2 = new Passenger();
        passenger2.setFirstName("Bharath");
        passenger2.setLastName("DInes");
        passenger2.setId(10);
        System.out.println(passenger2);

        System.out.println(passenger.hashCode());
        System.out.println(passenger2.hashCode());

        System.out.println(passenger.equals(passenger2));
    }
}
