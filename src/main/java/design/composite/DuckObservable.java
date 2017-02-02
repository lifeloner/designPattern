package design.composite;

/**
 * Created by fuyang on 2017/1/28.
 */
public interface DuckObservable {
    void register(Observer observer);
    void notifyObservers();
}
