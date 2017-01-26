package design.state;

/**
 * Created by fuyang on 2017/1/26.
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("not, no gamball left...");
    }

    public void ejectQuarter() {
        System.out.println("sorry,you have not insert a quarter...");
    }

    public void turnCrank() {
        System.out.println("you have not insert a quarter...");
    }

    public void dispense() {
        System.out.println("no ball...");
    }
}
