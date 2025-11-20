package algomaster_lld.airlinemanagementsystem;

import algomaster_lld.airlinemanagementsystem.seat.Seat;

import java.util.List;

public class Aircraft {
    private final String model;
//    private List<Seat> seats; // list of seats is this representation correct?

    //what is tailNumber? why we important in Aircraft
    //why there is no details of seats only totalSeats is this correct?

    private final String tailNumber;
    private final int totalSeats;

    //what are info needed when we created Aircraft
    public Aircraft(String tailNumber, String model, int totalSeats) {
        this.model = model;
        this.tailNumber = tailNumber;
        this.totalSeats = totalSeats;
    }

    //what are actions Aircraft and what are thing it knows

    public String getTailNumber() {
        return this.tailNumber;
    }

    // what are info needed for other objects from aircraft object
    //do they need totalSeats
    //do they need model

}
