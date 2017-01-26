package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class CheesePizza extends Pizza {
    public void cut() {
        System.out.println("cheesePizza cut...");
    }

    public void bake() {
        System.out.println("cheesePizza bake...");
    }
}
