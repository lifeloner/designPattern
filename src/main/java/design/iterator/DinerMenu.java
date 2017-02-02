package design.iterator;

import java.util.Iterator;

/**
 * Created by fuyang on 2017/1/27.
 */
public class DinerMenu implements Menu{

    public static final int MAX_SIZE = 6;
    private Integer[] items;
    private int index;

    public DinerMenu() {
        items = new Integer[MAX_SIZE];
        index = 0;
        addItem(3);
        addItem(6);
        addItem(5);
        addItem(8);
        addItem(2);
        addItem(1);
    }

    public void addItem(int num) {
        if (index >= MAX_SIZE) {
            System.out.println("array full...");
        } else {
            items[index++] = num;
        }
    }

    public Integer[] getItems() {
        return items;
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(items);
    }

}
