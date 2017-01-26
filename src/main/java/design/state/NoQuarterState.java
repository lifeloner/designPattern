package design.state;

/**
 * Created by fuyang on 2017/1/26.
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("you have not insert a querter...");
    }

    public void turnCrank() {
        System.out.println("there is no querter...");
    }

    public void dispense() {
        System.out.println("you must pay first...");
    }
}
