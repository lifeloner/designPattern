package design.component;

import java.util.Iterator;

/**
 * Created by fuyang on 2017/1/27.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
