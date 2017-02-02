package design.component;

import java.util.Iterator;

/**
 * Created by fuyang on 2017/1/27.
 */
public class Waitress {
    public MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        Iterator<MenuComponent>iterator=menuComponent.createIterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }

    public static void main(String[] args) {
            MenuComponent cake=new Menu("a");
            MenuComponent diner=new Menu("b");
            MenuComponent caffe=new Menu("c");
            MenuComponent all=new Menu("all");
            all.add(caffe);
            all.add(cake);
            all.add(diner);
            caffe.add(new MenuItem("zzz"));
            Waitress waitress=new Waitress(all);
            waitress.printMenu();
    }
}
