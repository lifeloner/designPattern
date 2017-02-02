package design.composite;

/**
 * Created by fuyang on 2017/1/28.
 */
public class Duckologist implements Observer {

    @Override
    public void update(DuckObservable duckObservable) {
        System.out.println("???"+duckObservable);
    }
}
