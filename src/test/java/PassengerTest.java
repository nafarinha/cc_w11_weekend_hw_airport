import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Smith", "Jack");
    }

    @Test
    public void canGetPrettyPassengerName() {
        assertEquals("Jack Smith", passenger1.prettyName());
    }

}