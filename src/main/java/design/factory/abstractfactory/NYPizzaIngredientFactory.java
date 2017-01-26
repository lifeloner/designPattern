package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinDough();
    }

    public Sauce createSause() {
        return new ThinSauce();
    }
}
