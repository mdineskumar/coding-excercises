package algomaster_lld.parkinglot;

import algomaster_lld.parkinglot.parkingspot.ParkingSpot;
import algomaster_lld.parkinglot.vehicle.Vehicle;
import algomaster_lld.parkinglot.vehicle.VehicleType;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParkingFloor {
    int floorNumber;
    private final List<ParkingSpot> parkingSpots;
    Map<VehicleType, List<ParkingSpot>> availableSpots;
    Map<String, ParkingSpot> occupiedSpots; // quickly find a vehicle when unpark

    public ParkingFloor(int floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public synchronized Optional<ParkingSpot> getAvailableSpot(Vehicle vehicle){
        return parkingSpots.stream().filter(spot->spot.isAvailable() && spot.canFitVehicle(vehicle)).findFirst();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    //ParkingLot manages
    void findAndParkVehicle(Vehicle vehicle){

    }

    void unpark(ParkingSpot spot){

    }

    void findAvailableSpots(VehicleType vehicleType){


    }
}
