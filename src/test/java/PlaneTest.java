import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Passenger passenger1, passenger2, passenger3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUSA380, "ScotAir");

        passenger1 = new Passenger("Smith", "Samantha");
        passenger2 = new Passenger("Doe", "Jonathan");
        passenger3 = new Passenger("Davids", "Keith");
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.AIRBUSA380, plane1.getType());
    }

    @Test
    public void canGetAirline() {
        assertEquals("ScotAir", plane1.getAirline());
    }

    @Test
    public void canGetPassengers() {
        assertEquals(0, plane1.getPassengers().size());
    }

}
