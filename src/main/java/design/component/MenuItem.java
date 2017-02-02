package design.component;

import java.util.Iterator;

/**
 * Created by fuyang on 2017/1/27.
 */
public class MenuItem extends MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("print... "+name);
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
