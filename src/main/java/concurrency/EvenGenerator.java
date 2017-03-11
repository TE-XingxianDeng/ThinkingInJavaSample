package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 11:31
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;  // Danger point here!
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
