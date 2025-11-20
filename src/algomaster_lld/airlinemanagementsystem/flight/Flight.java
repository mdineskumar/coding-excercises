package algomaster_lld.airlinemanagementsystem.flight;

import algomaster_lld.airlinemanagementsystem.Aircraft;
import algomaster_lld.airlinemanagementsystem.seat.Seat;

import java.time.LocalDateTime;
import java.util.*;

public class Flight {
    private final String flightNumber;// why this datatype "String"
    private final String source; // is this changeable after initiated
    private final String destination; // source and destination sharing some common fields: Name, Time
    private final Aircraft aircraft;

    //why use LocalDateTime instead of Date
    //schedule can be divide into: arrival time and departure time
    private final LocalDateTime arrivalTime;
    private final LocalDateTime departureTime;

    private final FlightStatus status;//what are possible status for flight status: CANCELLED, ARRIVED, DELAY,

    private final Map<String, Seat> seats; // why they use Map: what are key and value: value is seat object then key will be seatnumber right?

    private final List<Seat> availableSeats; // they define available seats: why? because avalilability is related to journey not with aircraft


    //what are things needed to create flight: source, destination must needed: aircraft, arrivalTime, departureTime
    // when we created flightNumber and status can be set.
    //how can we create seats or do we need to set


    public Flight(String source, String destination, Aircraft aircraft, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.flightNumber = UUID.randomUUID().toString();
        this.source = source;
        this.destination = destination;
        this.aircraft = aircraft;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.status = FlightStatus.ON_TIME;
        this.seats = new HashMap<>();
        this.availableSeats = new ArrayList<>();
    }

    //what are actions Flight Class can do
    //reserve seat
    public synchronized void reserveSeat(String seatNo){
        Seat seat = seats.get(seatNo);
        if (seat == null) throw new IllegalArgumentException("Seat is not exist");        // why not RuntimeException()
        seat.reserve();
    }
    //release seat : do we need to synchronized
    // do we need return something boolean?
    public synchronized void releaseSeat(String seatNo){
        Seat seat = seats.get(seatNo);
        if (seat==null) throw new IllegalArgumentException("Invalid Seat Numver");
        seat.release();
    }

    //get is seat is available
    //how to decide parameters: is only seatNo or seat object itself
    //is seatNo unique to all seats in flight
    public synchronized boolean isSeatAvailable(String seatNo) {
        Seat seat = seats.get(seatNo);
        return seat != null && seat.isBooked();
    }

    // other getter and setter
       //why there is no setter?
    //why there is getter for Status?
    //or airCraft?
    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
}
