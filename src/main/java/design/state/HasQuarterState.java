package design.state;

import java.util.Random;

/**
 * Created by fuyang on 2017/1/26.
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you have insert a quarter...");
    }

    public void ejectQuarter() {
        System.out.println("quarter returned...");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("you turned...");
        int winner=new Random().nextInt(10);
        if((winner==0)&&(gumballMachine.getCount()>1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("no gumball dispensed...");
    }
}
