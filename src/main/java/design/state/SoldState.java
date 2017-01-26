package design.state;

/**
 * Created by fuyang on 2017/1/26.
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("wait, give you a gumball...");
    }

    public void ejectQuarter() {
        System.out.println("sorry,you have turned...");
    }

    public void turnCrank() {
        System.out.println("you have turned...");
    }

    public void dispense() {
        gumballMachine.getBall();
        if(gumballMachine.getCount()==0){
            System.out.println("sold out...");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
