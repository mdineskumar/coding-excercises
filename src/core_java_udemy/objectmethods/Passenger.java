package core_java_udemy.objectmethods;

public class Passenger {
    private int id;
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger info is First Name: "+ this.firstName + " Last Name: " + this.lastName;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Passenger p = (Passenger) obj;
        return (this.id == p.getId() && p.getFirstName().equals(this.firstName) && p.getLastName().equals(this.lastName));
    }
}
