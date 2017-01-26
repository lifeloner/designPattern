package design.state;

/**
 * Created by fuyang on 2017/1/26.
 */
public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;
    private State currentState;
    private int count;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState=new WinnerState(this);
        currentState = soldOutState;
        this.count = count;
        if (count > 0) {
            currentState = noQuarterState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        dispense();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void setState(State state){
        currentState=state;
    }

    public void getBall(){
        System.out.println("a ball comes rolling out the slot...");
        if(count!=0){
            count=count-1;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public static void main(String[] args) {
        GumballMachine gumballMachine=new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
