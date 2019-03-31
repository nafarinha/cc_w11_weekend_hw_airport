import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane1;
    Flight flight1;


    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUSA330, "Norwegian");
        flight1 = new Flight("DY3505", "CPH", plane1);
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("DY3505", flight1.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("CPH", flight1.getDestination());
    }

    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.AIRBUSA330, flight1.getPlane().getType());
    }
}
