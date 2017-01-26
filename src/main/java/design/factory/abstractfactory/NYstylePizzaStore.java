package design.factory.abstractfactory;


/**
 * Created by fuyang on 2017/1/17.
 */
public class NYstylePizzaStore extends PizzaStore {



    public Pizza createPizze(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza=new CheesePizza(pizzaIngredientFactory);
        }else if(type.equals("chicago")){
            pizza=new ChicagoPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
