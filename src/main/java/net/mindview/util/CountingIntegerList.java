package net.mindview.util;

import java.util.AbstractList;
import java.util.Collection;

/**
 * @author Dylan
 * @version 1.00 7/20/2016 23:06
 */
public class CountingIntegerList
        extends AbstractList<Integer> {
    private int size;
    public CountingIntegerList(int size) {
        this.size = size < 0 ? 0 : size;
    }
    public Integer get(int index) {
        return Integer.valueOf(index);
    }
    public int size() { return size; }
    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }
}
