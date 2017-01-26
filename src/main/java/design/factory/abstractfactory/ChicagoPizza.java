package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ChicagoPizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        sauce=pizzaIngredientFactory.createSause();
    }
}
