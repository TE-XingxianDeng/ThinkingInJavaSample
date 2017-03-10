package concurrency;

/**
 * @author dylan
 * @version 1.00 3/10/17 3:00 PM
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    /**
     * Allow this to be canceled
     */
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
