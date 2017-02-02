package design.component;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by fuyang on 2017/1/27.
 */
public class CompositeIterator implements Iterator{

    private Iterator<MenuComponent>iterator;
    private Stack<Iterator>stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        this.iterator = iterator;
        stack=new Stack<>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }
        Iterator<MenuComponent>iterator=stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        if(!hasNext()){
            return null;
        }
        Iterator <MenuComponent>iterator=stack.peek();
        MenuComponent component=iterator.next();
        if(component instanceof Menu){
            stack.push(component.createIterator());
        }
        return component;
    }
}
