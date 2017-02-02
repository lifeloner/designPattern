package design.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fuyang on 2017/1/27.
 */
public class Menu extends MenuComponent {

    private String name;

    private List<MenuComponent> list;

    public Menu(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public MenuComponent getChild(int n) {
        return list.get(n);
    }

    @Override
    public void print() {
        System.out.println("print."+name);
        Iterator<MenuComponent> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(list.iterator());
    }
}
