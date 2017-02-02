package design.composite;

/**
 * Created by fuyang on 2017/1/28.
 */
public class DuckSimulator {

    public void simulate(Duck duck) {
        duck.quack();
    }

    public void simulate(AbstractFactory factory) {
        Duck duck = factory.create();
        Flock flock = new Flock();
        flock.add(duck);
        flock.add(duck);
        flock.add(duck);
        Flock flock1 = new Flock();
        flock1.add(duck);
        flock1.add(duck);
        flock1.add(duck);
        flock.add(flock1);
        simulate(flock);
        System.out.println("\n");
        simulate(flock1);
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        Duck one=new MallardDuck();
        Duckologist duckologist=new Duckologist();
        one.register(duckologist);
        simulator.simulate(one);
//        Duck two=new DuckCount(new MallardDuck());
//        Duck three=new DuckCount(new GooseAdapter(new Goose()));
//        simulator.simulate(one);
//        simulator.simulate(two);
//        simulator.simulate(three);
//        System.out.println(DuckCount.getCount());
//        AbstractFactory factory = new DuckFactory();
//        simulator.simulate(factory);
    }
}
