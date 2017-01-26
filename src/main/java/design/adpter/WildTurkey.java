package design.adpter;

/**
 * Created by fuyang on 2017/1/21.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("gobble...");
    }

    public void fly() {
        System.out.println("fly a short distance...");
    }
}
