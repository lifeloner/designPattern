package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        dough=pizzaIngredientFactory.createDough();
    }
}
