package design.template;

/**
 * Created by fuyang on 2017/1/26.
 */
public class Tea  extends CaffeineBeverage{
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("adding lemon");
    }

    public static void main(String[] args) {
        CaffeineBeverage tea=new Tea();
        tea.prepareRecipe();
        CaffeineBeverage coffee=new Coffee();
        coffee.prepareRecipe();
    }
}
