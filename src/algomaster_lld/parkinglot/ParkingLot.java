package algomaster_lld.parkinglot;

import algomaster_lld.parkinglot.fee.FeeStrategy;
import algomaster_lld.parkinglot.fee.FlatRateFeeStrategy;
import algomaster_lld.parkinglot.parkingspot.ParkingSpot;
import algomaster_lld.parkinglot.vehicle.Vehicle;
import algomaster_lld.parkinglot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {

    private static final ParkingLot INSTANCE = new ParkingLot();
    private final List<ParkingFloor> floors = new ArrayList<>();
    private final Map<String, ParkingTicket> activeTickets = new ConcurrentHashMap<>();

    //fee strategy
    private FeeStrategy feeStrategy;

    //List<ParkingFloor> floors;

    //Map<String, Ticket> tickets;


    private ParkingLot() {
        feeStrategy = new FlatRateFeeStrategy();
    }

    public static synchronized ParkingLot getInstance(){
        return  INSTANCE;
    }

    public void addFloor(ParkingFloor floor){
        floors.add(floor);
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    //why we need synchornized
    public synchronized ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        for(ParkingFloor floor: floors){
            Optional<ParkingSpot> spotOpt= floor.getAvailableSpot(vehicle);
            if(spotOpt.isPresent()){
                ParkingSpot spot = spotOpt.get();
                if(spot.assignVehicle(vehicle)){
                    ParkingTicket ticket = new ParkingTicket(vehicle,spot);
                    activeTickets.put(vehicle.getLicenseNumber(),ticket);
                    return ticket;
                }
            }
        }
        throw new Exception("No available spot for "+vehicle.getType());
    }

    public synchronized double unparkVehicle(String licenseNumber) throws Exception {
        ParkingTicket ticket = activeTickets.remove(licenseNumber);
        if(ticket==null) throw new Exception("Ticket not found");
        ticket.getSpot().removeVehicle();
        ticket.setExitTimestamp();
        return feeStrategy.calculateFee(ticket);
    }


//    Ticket parkVehicle(Vehicle vehicle){
//
//        return new Ticket();
//    }
//
//    double unparkVehicle(Ticket ticket){
//        return 0;
//    }
//
//    ParkingSpot findAvailableSpot(VehicleType vehicleType){
//        return new ParkingSpot();
//    }
//
//    void allocate(Vehicle vehicle, ParkingSpot parkingSpot) {
//
//    }
//
//    Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
//        return new Ticket();
//    }
//
//    void CloseTicket(Ticket ticket){
//
//    }
//
//    void calculateFee(Ticket ticket){
//
//    }



}
