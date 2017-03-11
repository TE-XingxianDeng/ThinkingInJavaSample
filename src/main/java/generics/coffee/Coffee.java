package generics.coffee;

/**
 * @author dylan
 * @version 1.00 7/24/16 11:50 AM
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
