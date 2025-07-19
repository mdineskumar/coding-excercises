package algomaster_lld.parkinglot.parkingspot;

import algomaster_lld.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    //Attributes
    private final String spotId;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
    }

    //behaviors
    public synchronized boolean assignVehicle(Vehicle vehicle) {
        if ( isOccupied ) {
            return false;
        }
        isOccupied = true;
        parkedVehicle = vehicle;
        return true;
    }

    public synchronized void removeVehicle() {
        isOccupied = false;
        parkedVehicle = null;
    }


    synchronized boolean park(Vehicle vehicle){
        if ( isOccupied ) {
            return false;
        }
        isOccupied = true;
        parkedVehicle = vehicle;
        return true;
    }


    public synchronized void unpark(){
        isOccupied = false;
        parkedVehicle = null;

    }

    public abstract boolean canFitVehicle(Vehicle vehicle);

    public String getSpotId() {
        return spotId;
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }



}
