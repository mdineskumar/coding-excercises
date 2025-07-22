package algomaster_lld.parkinglot;

import algomaster_lld.parkinglot.parkingspot.ParkingSpot;
import algomaster_lld.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    String ticketId;
    LocalDateTime entryTime;
    Vehicle vehicle;
    ParkingSpot allocatedSpot;


}
