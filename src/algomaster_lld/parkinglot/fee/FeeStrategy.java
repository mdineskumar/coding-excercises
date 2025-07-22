package algomaster_lld.parkinglot.fee;

import algomaster_lld.parkinglot.ParkingTicket;

public interface FeeStrategy {
    double calculateFee(ParkingTicket parkingTicket);
}
