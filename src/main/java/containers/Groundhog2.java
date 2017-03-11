package containers;

/**
 * A class that's used as a key in a HashMap
 * Must override hashCode() and equals().
 *
 * @author Dylan.Deng
 * @version 1.00 2016-08-15
 */
public class Groundhog2 extends Groundhog {
    public Groundhog2(int n) {
        super(n);
    }

    public int hashCode() {
        return number;
    }

    public boolean equals(Object o) {
        return o instanceof Groundhog2 &&
                (number == ((Groundhog2) o).number);
    }
}