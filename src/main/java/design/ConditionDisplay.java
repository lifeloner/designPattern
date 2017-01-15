package design;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by fuyang on 2017/1/15.
 */
public class ConditionDisplay implements Observer {

    private Observable observable;

    private float temperature;

    public ConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            temperature =((WeatherData) o).getTemperature();
            display();
        }
    }

    public void display(){
        System.out.println(this+ " temperature is "+temperature);
    }
}
