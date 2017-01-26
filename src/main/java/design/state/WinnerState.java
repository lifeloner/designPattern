package design.state;

/**
 * Created by fuyang on 2017/1/26.
 */
public class WinnerState implements State {

    public  GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("winner, you are lucky...");
        gumballMachine.getBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.getBall();
            if(gumballMachine.getCount()>0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("sold out...");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }else{
            System.out.println("sold out...");
            gumballMachine.setState(gumballMachine.getSoldOutState());

        }

    }
}
