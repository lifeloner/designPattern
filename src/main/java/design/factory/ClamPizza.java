package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ClamPizza extends Pizza {
    public void cut() {
        System.out.println("ClamPizza cut...");
    }

    public void bake() {
        System.out.println("ClamPizza bake...");
    }
}
