import java.util.ArrayList;

public class Airport {

    private String code;
    private ArrayList<Plane> hangar;

    public Airport(String code) {
        this.code = code;
        this.hangar = new ArrayList<>();

    }

    public String getCode() {
        return this.code;
    }
    public ArrayList<Plane> getHangarCount() {
        return this.hangar;
    }

    public Flight createFlight(String flightNumber, String destination, Plane plane) {
        Flight newFlight = new Flight(flightNumber, destination, plane);
        return newFlight;
    }


}
