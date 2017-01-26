package design.adpter;

/**
 * Created by fuyang on 2017/1/21.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for(int i=0;i<3;i++) {
            turkey.fly();
        }
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey wildTurkey=new WildTurkey();
        mallardDuck.quack();
        mallardDuck.fly();
        wildTurkey.gobble();
        wildTurkey.fly();
        Duck duck=new TurkeyAdapter(wildTurkey);
        duck.fly();
        duck.quack();
    }
}
