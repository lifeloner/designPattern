package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("clam")){
            pizza=new ClamPizza();
        }
        return pizza;
    }

    public static void main(String[] args) {
        Pizza pizza=createPizza("cheese");
        pizza.cut();
        pizza.bake();
    }
}
