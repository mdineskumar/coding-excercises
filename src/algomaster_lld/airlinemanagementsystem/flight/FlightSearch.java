package algomaster_lld.airlinemanagementsystem.flight;



import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//what responsibility of FlightSearch class
// search Flight
//why didnot include in the Flight Class itself
public class FlightSearch {
    private final List<Flight> flights;

    public FlightSearch() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> searchFlight(String source, String destination, LocalDate date) {
        return flights.stream().filter(flight -> flight.getSource().equalsIgnoreCase(source)
                && flight.getDestination().equalsIgnoreCase(destination)
                && flight.getDepartureTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
    }
}
