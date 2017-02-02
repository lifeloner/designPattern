package design.iterator;

import java.util.Iterator;

/**
 * Created by fuyang on 2017/1/27.
 */
public class DinerMenuIterator implements Iterator {

    private Integer[]nums;
    private int index;
    public DinerMenuIterator(Integer[] nums) {
        this.nums = nums;
        index=0;
    }

    @Override
    public boolean hasNext() {
        if(index>=nums.length||nums[index]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return nums[index++];
    }
}
