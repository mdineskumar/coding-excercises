package algomaster_lld.airlinemanagementsystem.seat;

public class Seat {
    //why seatNumber is String type
    //why it is final: value cannot be changed once initialized
    //why there is SeatType and SeatStatus
    private final String seatNumber;
    private final SeatType seatType;

    //simple use boolean is enough right why use different states
    private SeatStatus seatStatus;

    //seatNumber and seatType should be given when seat is created right? what are the other things we need
    public Seat(String seatNo, SeatType seatType){
        this.seatNumber = seatNo;
        this.seatType = seatType;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    //what actions Seat can performed: Think of it Seat can reserved or booked or release by user when booking stage
    public void reserve() {
        this.seatStatus = SeatStatus.RESERVED; // is this atomic action?
    }

    public void release() {
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    //why there is no method like book(). is Seat class not responsible for that

    //we can get seatStatus, seatNumber
    public String getSeatNumber() {
        return this.seatNumber;
    }

    // why isBooked method is synchronized
    //only one thread can execute isBooked at a time
    // and if we have multiple synchronized method only one thread can execute that methods at given time.
    public synchronized boolean isBooked() {
        return seatStatus==SeatStatus.BOOKED;
    }

}
