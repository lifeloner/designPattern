package design.state;

/**
 * Created by fuyang on 2017/1/26.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
