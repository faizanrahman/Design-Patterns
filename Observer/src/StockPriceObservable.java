import java.util.ArrayList;
import java.util.List;

// This is generally called a 'Subject/Observable'
public class StockPriceObservable {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    };

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    };

    public void notifyObservers(){
        for(var observer: observers)
            observer.update();
    }

}
