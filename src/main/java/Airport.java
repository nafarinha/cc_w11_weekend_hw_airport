import java.util.ArrayList;

public class Airport {

    private String code;
    private ArrayList<Plane> hangar;
    private ArrayList<Passenger> passengers;

    public Airport(String code) {
        this.code = code;
        this.hangar = new ArrayList<>();
        this.passengers = new ArrayList<>();

    }

    public String getCode() {
        return this.code;
    }
    public ArrayList<Plane> getHangar() {
        return this.hangar;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public void addPassenger(Passenger newPassenger) {
        this.passengers.add(newPassenger);
    }

    public void removePassenger (Passenger removedPassenger) {
        this.passengers.remove(removedPassenger);
    }


    public Flight createFlight(String flightNumber, String destination, Plane newPLane) {
        Flight newFlight = new Flight(flightNumber, destination);
        newFlight.addPlane(newPLane);
        return newFlight;
    }

    public void addPlaneToHangar(Plane newPlane) {
        this.hangar.add(newPlane);
    }

    public void removePlaneFromHangar(Plane removedPlane) {
        this.hangar.remove(removedPlane);
    }

    public void assignPlaneToFlight(Plane newPlane, Flight newFlight) {
        this.removePlaneFromHangar(newPlane);
        newFlight.addPlane(newPlane);

    }

    public void sellTicket(Passenger newPassenger, Flight newFlight) {
        Ticket newTicket = new Ticket(newFlight.getFlightNumber());
        newTicket.addOrigin(this.code);
        newTicket.addDestination(newFlight.getDestination());
        newPassenger.addTicket(newTicket);
        addPassenger(newPassenger);


    }





}
