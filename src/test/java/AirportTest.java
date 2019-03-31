import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Ticket ticket1;
    Plane plane1, plane2;
    Flight flight1;
    Airport airport1;

    @Before
    public void before() {
        ticket1 = new Ticket("DY3503");
        plane1 = new Plane(PlaneType.BOEING777, "Norwegian");
        plane2 = new Plane(PlaneType.AIRBUSA330, "KLM");
        flight1 = new Flight("DY3503", "AMS");
        airport1 = new Airport("EDI");
    }

    @Test
    public void canGetCode() {
        assertEquals("EDI", airport1.getCode());
    }

    @Test
    public void canGetHangar() {
        assertEquals(0, airport1.getHangar().size());
    }

    @Test
    public void canCreateFlight() {
        Flight testFlight = airport1.createFlight("DY3503", "AMS", plane1);
        assertEquals(flight1.getFlightNumber(), testFlight.getFlightNumber());
    }

    @Test
    public void canAddPlaneToHangar() {
        airport1.addPlaneToHangar(plane1);
        assertEquals(1, airport1.getHangar().size());
    }

    @Test
    public void canRemovePlaneFromHangar() {
        airport1.addPlaneToHangar(plane1);
        airport1.addPlaneToHangar(plane2);

        airport1.removePlaneFromHangar(plane1);

        assertEquals(1, airport1.getHangar().size());
    }

/*    @Test
    public void canAssignPlaneToFlight() {
        airport1.addPlaneToHangar(plane1);
        airport1.addPlaneToHangar(plane2);

        airport1.assignPlaneToFlight(plane1)

        assertEquals();

    }*/
}
