package design;

/**
 * Created by fuyang on 2017/1/15.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+" , Mocha";
    }

    public double cost() {
        return beverage.cost()+0.01;
    }

    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" "+beverage.cost());
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+" "+beverage.cost());
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+" "+beverage.cost());

    }
}
