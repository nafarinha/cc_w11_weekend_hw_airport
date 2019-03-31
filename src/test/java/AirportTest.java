import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Passenger passenger1;
    Ticket ticket1;
    Plane plane1, plane2;
    Flight flight1;
    Airport airport1;

    @Before
    public void before() {
        passenger1 = new Passenger("Smith", "Jane");
        ticket1 = new Ticket("DY3503");
        plane1 = new Plane(PlaneType.BOEING777, "Norwegian");
        plane2 = new Plane(PlaneType.AIRBUSA330, "KLM");
        flight1 = new Flight("KL1276", "AMS");
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
        assertEquals("DY3503", testFlight.getFlightNumber());
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

    @Test
    public void canAssignPlaneToFlight() {
        airport1.addPlaneToHangar(plane1);
        airport1.addPlaneToHangar(plane2);

        airport1.assignPlaneToFlight(plane1, flight1);

        assertEquals(1, airport1.getHangar().size());
        assertEquals(PlaneType.BOEING777, flight1.getPlane().getType());
    }

    @Test
    public void canSellTicketToPassenger() {
        airport1.sellTicket(passenger1, flight1);
        Ticket testTicket = passenger1.getTickets().get(0);

        assertEquals(1, passenger1.getTickets().size());
        assertEquals("EDI", testTicket.getOrigin());
        assertEquals("AMS", testTicket.getDestination());
        assertEquals("KL1276", testTicket.getFlightNumber());
    }
}
