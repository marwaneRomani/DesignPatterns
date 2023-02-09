package Observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int totalQty;
    private List<Observer> observers = new ArrayList<>();

    public void addObs(Observer observer) {
        observers.add(observer);
    }
    public void removeObs(Observer observer) {
        var index = observers.indexOf(observer);
        var removedObs = observers.get(index);
        observers.remove(removedObs);
    }

    public void notifyObs() {
        for (var observer : observers)
            observer.update();
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
        notifyObs();
    }
}
