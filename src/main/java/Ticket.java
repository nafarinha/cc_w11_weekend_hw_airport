
public class Ticket {

    private long ticketNumber;
    private String origin;
    private String destination;
    private String flightNumber;

    public Ticket(String flightNumber) {
        this.flightNumber = flightNumber;
        this.generateTicketNumber();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void generateTicketNumber() {
        //Mimics the IATA E-Ticket format
        long leftLimit = 10000000000000L;
        long rightLimit = 100000000000000L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        this.ticketNumber = generatedLong;

    }

    public long getTicketNumber() {
        return ticketNumber;
    }
}
