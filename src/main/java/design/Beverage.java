package design;

/**
 * Created by fuyang on 2017/1/15.
 */
public abstract class Beverage {

    protected String description="beverage";


    public  String getDescription(){
        return description;
    }

    public abstract double cost();

}
