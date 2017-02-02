package design.composite;

/**
 * Created by fuyang on 2017/1/28.
 */
public class CountingDuckFactory extends AbstractFactory {
    @Override
    public Duck create() {
        return new DuckCount(new MallardDuck());
    }
}
