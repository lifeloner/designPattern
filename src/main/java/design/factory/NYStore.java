package design.factory;

/**
 * Created by fuyang on 2017/1/17.
 */
public class NYStore extends PizzaStore {

    public Pizza createpizza(String type) {
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new NYStyleCheesePizza();
        }else  if(type.equals("clam")){
            pizza=new NYStyleClamPizza();
        }
        return pizza;
    }
}
