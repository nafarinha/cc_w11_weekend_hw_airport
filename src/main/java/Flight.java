public class Flight {

    private String flightNumber;
    private String destination;
    private Plane plane;

    public Flight(String flightNumber, String destination, Plane plane) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.plane = plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public Plane getPlane(){
        return this.plane;
    }


}
