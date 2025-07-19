package algomaster_lld.parkinglot.parkingspot;

import algomaster_lld.parkinglot.vehicle.Vehicle;
import algomaster_lld.parkinglot.vehicle.VehicleType;

public class CompactSpot extends ParkingSpot {

    public CompactSpot(String spotId) {
        super(spotId);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getType() == VehicleType.CAR;
    }
}
