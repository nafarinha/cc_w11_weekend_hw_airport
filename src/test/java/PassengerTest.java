import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Ticket ticket1;

    @Before
    public void before() {
        passenger1 = new Passenger("Smith", "Jack");
        ticket1 = new Ticket("DY3503");
    }

    @Test
    public void canGetPrettyPassengerName() {
        assertEquals("Jack Smith", passenger1.prettyName());
    }

    @Test
    public void canGetTickets() {
        assertEquals(0, passenger1.getTickets().size());
    }

    @Test
    public void canAddTickets() {
        passenger1.addTicket(ticket1);
        assertEquals(1, passenger1.getTickets().size());
    }

}