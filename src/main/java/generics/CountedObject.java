package generics;

/**
 * @author Dylan
 * @version 1.00 7/24/2016 15:01
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
