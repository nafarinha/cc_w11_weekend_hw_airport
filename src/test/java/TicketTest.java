import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
