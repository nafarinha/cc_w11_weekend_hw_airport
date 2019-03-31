public class Flight {

    private String flightNumber;
    private String destination;
    private Plane plane;

    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.plane = null;
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

/*    public void addPlane(Plane newPlane) {
        this.plane = newPlane;
    }*/


}
