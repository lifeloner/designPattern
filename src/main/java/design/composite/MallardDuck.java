package design.composite;

/**
 * Created by fuyang on 2017/1/21.
 */
public class MallardDuck implements Duck {

    private Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observable.register(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
