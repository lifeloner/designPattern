package design.composite;

/**
 * Created by fuyang on 2017/1/28.
 */
public class DuckCount implements Duck {

    private Duck duck;
    private static int count=0;

    public DuckCount(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void register(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
