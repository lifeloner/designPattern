package design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fuyang on 2017/1/28.
 */
public class Observable implements DuckObservable {

    private DuckObservable duckObservable;
    private List<Observer>list;

    public Observable(DuckObservable duckObservable) {
        this.duckObservable=duckObservable;
        list=new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer>iterator=list.iterator();
        while(iterator.hasNext()){
            iterator.next().update(duckObservable);
        }
    }
}
