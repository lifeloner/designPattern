package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public abstract class Pizza {
    protected Dough dough;
    protected Sauce sauce;
    public abstract void prepare();
}
