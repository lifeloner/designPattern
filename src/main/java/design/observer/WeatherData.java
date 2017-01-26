package design.observer;


import java.util.Observable;

/**
 * Created by fuyang on 2017/1/15.
 */
public class WeatherData extends Observable {

    private float temperature;

    public void measureChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measureChanged();
    }

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        ConditionDisplay conditionDisplayOne=new ConditionDisplay(weatherData);
        ConditionDisplay conditionDisplayTwo=new ConditionDisplay(weatherData);
        weatherData.setTemperature(38);
    }
}
