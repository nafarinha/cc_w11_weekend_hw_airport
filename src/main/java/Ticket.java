public class Ticket {

    private int ticketNumber;
    private String origin;
    private String destination;
    private String flightNumber;

    public Ticket(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }
}
