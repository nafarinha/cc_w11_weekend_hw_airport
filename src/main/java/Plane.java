import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        passengers = new ArrayList<>();
    }

    public PlaneType getType() {
        return this.type;
    }

    public String getAirline() {
        return this.airline;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public void addPassenger(Passenger newPassenger) {
        this.passengers.add(newPassenger);
    }
}
