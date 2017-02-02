package design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fuyang on 2017/1/27.
 */
public class PancakeMenu implements Menu{
    private List<Integer>list;

    public PancakeMenu() {
        this.list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
    }

    public void addItem(int num){
        list.add(num);
    }

    public List getItems(){
        return list;
    }

    public Iterator createIterator(){
        return list.iterator();
    }
}
