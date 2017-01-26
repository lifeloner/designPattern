package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public void cut() {
        System.out.println("ChicagoStyleCheesePizza cut...");
    }

    public void bake() {
        System.out.println("ChicagoStyleCheesePizza bake...");
    }
}
