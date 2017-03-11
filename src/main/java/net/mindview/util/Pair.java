package net.mindview.util;

/**
 * @author Dylan
 * @version 1.00 7/21/2016 23:09
 */
public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        key = k;
        value = v;
    }
}