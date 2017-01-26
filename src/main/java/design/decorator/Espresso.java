package design.decorator;

/**
 * Created by fuyang on 2017/1/15.
 */
public class Espresso extends Beverage{

    public double cost() {
        return 0.99;
    }

    public Espresso() {
        description="Espresso";
    }
}
