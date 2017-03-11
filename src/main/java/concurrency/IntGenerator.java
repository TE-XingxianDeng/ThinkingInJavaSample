package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 11:21
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    // Allow this to be cancaled:
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
