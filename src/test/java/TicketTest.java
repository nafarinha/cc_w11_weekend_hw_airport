import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {

    Ticket ticket1;

    @Before
    public void before() {
        ticket1 = new Ticket("DY3503");
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("DY3503", ticket1.getFlightNumber());
    }

    @Test
    public void has14DigitETicketNumber() {
        int actual = String.valueOf(ticket1.getTicketNumber()).length();
        assertEquals(14, actual);
    }

    @Test
    public void canGetOrigin() {
        assertNull(ticket1.getOrigin());
    }

    @Test
    public void canAddOrigin() {
        ticket1.addOrigin("EDI");
        assertEquals("EDI", ticket1.getOrigin());
    }

    @Test
    public void canGetDestination() {
        assertNull(ticket1.getDestination());
    }

    @Test
    public void canAddDestination() {
        ticket1.addDestination("CPH");
        assertEquals("CPH", ticket1.getDestination());
    }
}
