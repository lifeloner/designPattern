package design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fuyang on 2017/1/28.
 */
public class Flock implements Duck {
    private List<Duck>list;

    public Flock() {
        list=new ArrayList<>();
    }

    public void add(Duck duck){
        list.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Duck> iterator=list.iterator();
        while(iterator.hasNext()){
            iterator.next().quack();
        }
    }

    @Override
    public void register(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
