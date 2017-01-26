package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public abstract  class PizzaIngredientFactory {
    public abstract Dough createDough();
    public abstract Sauce createSause();

}
