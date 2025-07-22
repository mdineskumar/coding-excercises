package algomaster_lld.parkinglot.parkingspot;

import algomaster_lld.parkinglot.vehicle.Vehicle;
import algomaster_lld.parkinglot.vehicle.VehicleType;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(String spotId) {
        super(spotId);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getType() == VehicleType.MOTORBIKE;
    }


}
