import java.util.ArrayList;

public class Passenger {

    private String lastName;
    private String firstName;
    private ArrayList<Ticket> tickets;

    public Passenger(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.tickets = new ArrayList<>();
    }

    public String prettyName() {
        return firstName + " " + lastName;
    }

    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }

}