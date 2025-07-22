package algomaster_lld.parkinglot.fee;

import algomaster_lld.parkinglot.ParkingTicket;
import algomaster_lld.parkinglot.vehicle.Vehicle;
import algomaster_lld.parkinglot.vehicle.VehicleType;

import java.util.Map;

public class VehicleBasedFeeStrategy implements FeeStrategy {
    private final Map<VehicleType, Double> hourlyRates = Map.of(
            VehicleType.CAR, 20.0,
            VehicleType.MOTORBIKE,10.0,
            VehicleType.TRUCK,30.0
    );

    @Override
    public double calculateFee(ParkingTicket parkingTicket) {
        long duration = parkingTicket.getExitTimestamp() - parkingTicket.getEntryTimestamp();
        long hours = (duration / (1000 * 60 * 60)) + 1;
        return hours * hourlyRates.get(parkingTicket.getVehicle().getType());
    }
}
