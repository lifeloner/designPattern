package design.factory.abstractfactory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ChicagoPizaaStore extends PizzaStore {
    public Pizza createPizze(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory pizzaIngredientFactory=new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza=new CheesePizza(pizzaIngredientFactory);
        }else if(type.equals("chicago")){
            pizza=new ChicagoPizza(pizzaIngredientFactory);
        }
        return pizza;
    }

    public static void main(String[] args) {

    }
}
