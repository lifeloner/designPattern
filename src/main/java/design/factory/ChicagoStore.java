package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class ChicagoStore extends PizzaStore {
    public Pizza createpizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore=new ChicagoStore();
        Pizza pizza=pizzaStore.createpizza("cheese");
        pizza.cut();
        pizza.bake();
        pizzaStore=new NYStore();
        pizza=pizzaStore.createpizza("clam");
        pizza.cut();
        pizza.bake();
    }
}
