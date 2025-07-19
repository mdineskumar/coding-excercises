package algomaster_lld.parkinglot;

import algomaster_lld.parkinglot.fee.VehicleBasedFeeStrategy;
import algomaster_lld.parkinglot.parkingspot.*;
import algomaster_lld.parkinglot.vehicle.Bike;
import algomaster_lld.parkinglot.vehicle.Car;
import algomaster_lld.parkinglot.vehicle.Vehicle;

import java.util.List;

public class ParkingLotDemo {
    public static void run(){
        ParkingLot parkingLot = ParkingLot.getInstance();
        List<ParkingSpot> parkingSpotsFloor1 = List.of(
                new BikeParkingSpot("101"),
                new CompactSpot( "102"),
                new LargeSpot("103")
        );

        List<ParkingSpot> parkingSpotsFloor2 = List.of(
                new BikeParkingSpot("201"),
                new LargeSpot("202"),
                new CompactSpot("203")
        );

        //add a floor wihth different types of spots
        ParkingFloor floor1 = new ParkingFloor(1, parkingSpotsFloor1);
        ParkingFloor floor2 = new ParkingFloor(2, parkingSpotsFloor2);

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        parkingLot.setFeeStrategy(new VehicleBasedFeeStrategy());

        //create vehicles
        Vehicle car1 = new Car("ABC123");
        Vehicle car2 = new Car("XYZ789");
        Vehicle bike1 = new Bike("M1234");

        //Park vehicles
        try {
            ParkingTicket parkingTicket1 = parkingLot.parkVehicle(car1);
            System.out.println("Car 1 parks, Ticket ID: "+parkingTicket1.getTicketId());

            ParkingTicket parkingTicket2 = parkingLot.parkVehicle(car2);
            System.out.println("Car 2 parked, Ticket Id: " + parkingTicket2.getTicketId());


            ParkingTicket parkingTicket3 = parkingLot.parkVehicle(bike1);
            System.out.println("Bike 1 parked, Ticket Id: " + parkingTicket3.getTicketId());

            Vehicle car3 = new Car("DL0432");
            parkingLot.parkVehicle(car3);

        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }

        //unpark vehicle
        try {
            double fee = parkingLot.unparkVehicle(car1.getLicenseNumber());
            System.out.println("Vehicle: "+car1.getLicenseNumber()+ ", Fee: "+fee);

            fee = parkingLot.unparkVehicle("1"); //invalid license number

        } catch (Exception e) {
            System.out.println("exception while unparking: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        ParkingLotDemo.run();
    }

}
