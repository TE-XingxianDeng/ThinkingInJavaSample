package containers;

import java.util.WeakHashMap;

/**
 * Demonstrates WeakHashMap
 *
 * @author Dylan
 * @version 1.00 8/30/2016 20:38
 */
public class CanonicalMapping {
    public static void main(String[] args) {
        int size = 1000;
        // Or, choose size via the command line:
        if (args.length > 0)
            size = new Integer(args[0]);
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map =
                new WeakHashMap<Key, Value>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0)
                keys[i] = k;  // Save as "real" references
            map.put(k, v);
        }
        System.gc();
    }
}

class Element {
    private String ident;

    public Element(String id) {
        ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    public int hashCode() {
        return ident.hashCode();
    }

    @Override
    public boolean equals(Object r) {
        return r instanceof Element && ident.equals(((Element) r).ident);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finilizing " +
                getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {
    public Key(String id) {
        super(id);
    }
}

class Value extends Element {
    public Value(String id) {
        super(id);
    }
}
