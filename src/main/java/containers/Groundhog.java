package containers;

/**
 * Looks plausible, but doesn't work as a HashMap key.
 *
 * @author Dylan.Deng
 * @version 1.00 2016-08-15
 */
public class Groundhog {
    protected int number;

    public Groundhog(int n) {
        number = n;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}