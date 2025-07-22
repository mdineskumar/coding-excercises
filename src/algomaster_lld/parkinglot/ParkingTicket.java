package algomaster_lld.parkinglot;
import algomaster_lld.parkinglot.parkingspot.ParkingSpot;
import algomaster_lld.parkinglot.vehicle.Vehicle;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final long entryTimestamp;
    private long exitTimestamp;


    public ParkingTicket(Vehicle vehicle, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.spot = spot;
        this.ticketId = UUID.randomUUID().toString();
        this.entryTimestamp= new Date().getTime();
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public long getEntryTimestamp() {
        return entryTimestamp;
    }

    public void setExitTimestamp() {
        this.exitTimestamp = new Date().getTime();
    }

    public long getExitTimestamp() {
        return exitTimestamp;
    }
}
