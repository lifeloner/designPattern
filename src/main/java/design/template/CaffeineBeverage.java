package design.template;

/**
 * Created by fuyang on 2017/1/26.
 */
public abstract  class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void pourInCup() {
        System.out.println("pour into cup");
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public boolean hook(){
        return true;
    }

    public abstract void brew();

    public abstract void addCondiments();
}
