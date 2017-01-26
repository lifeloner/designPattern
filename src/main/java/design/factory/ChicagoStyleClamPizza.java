package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ChicagoStyleClamPizza extends Pizza {

    public void cut() {
        System.out.println("ChicagoStyleClamPizza cut...");
    }

    public void bake() {
        System.out.println("ChicagoStyleClamPizza bake...");
    }
}
