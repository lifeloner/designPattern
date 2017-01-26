package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickDough();
    }

    public Sauce createSause() {
        return new ThickSauce();
    }
}
