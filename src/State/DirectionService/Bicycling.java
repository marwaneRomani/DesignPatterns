package State.DirectionService;

public class Bicycling implements TravelMode {
    @Override
    public void calculateETA() {
        System.out.println("Calculating ETA (bicycling)");
    }

    @Override
    public void calculateDirection() {
        System.out.println("Calculating direction (bicycling)");
    }
}
