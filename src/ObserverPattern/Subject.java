package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ObserverPattern.Observer> observers = new ArrayList<ObserverPattern.Observer>();
    private int count;

    public int getVoteCount() {
        return count;
    }

    public void setVoteCount(int count) {
        this.count = count;
        notifyAllObservers();
    }

    public void attach(ObserverPattern.Observer observer) {
        observers.add(observer);
    }

    public void detach(ObserverPattern.Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (ObserverPattern.Observer observer : observers) {
            observer.update();
            ;
        }
    }
}
