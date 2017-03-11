package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dylan
 * @version 1.00 7/2/2016 16:55
 */
public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue =
            new AtomicInteger(0);

    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
