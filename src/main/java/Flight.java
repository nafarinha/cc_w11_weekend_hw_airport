public class Flight {

    private String flightNumber;
    private String destination;
    private Plane plane;

    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public void addPlane(Plane newPlane) {
        this.plane = newPlane;
    }

//    public Plane getPlane(){
//        return this.plane;
//    }


}
