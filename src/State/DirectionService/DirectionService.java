package State.DirectionService;

public class DirectionService {
    private TravelMode mode ;

    public DirectionService(TravelMode mode) {
        this.mode = mode;
    }
    public void getEta() {
        mode.calculateETA();
    }
    public void getDirection() {
        mode.calculateDirection();
    }

}