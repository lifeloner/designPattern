package design.composite;

/**
 * Created by fuyang on 2017/1/28.
 */
public class GooseAdapter implements Duck {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hook();
    }

    @Override
    public void register(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
