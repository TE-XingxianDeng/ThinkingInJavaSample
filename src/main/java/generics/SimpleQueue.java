package generics;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * a different kind of container that is Iterable
 *
 * @param <T>
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    public Iterator<T> iterator() {
        return storage.iterator();
    }
}