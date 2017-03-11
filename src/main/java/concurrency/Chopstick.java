package concurrency;

/**
 * Chopsticks for dining philosophers
 * @author dylan
 * @version 1.00 7/3/16 10:18 AM
 */
public class Chopstick {
    private boolean taken = false;
    public synchronized
    void take() throws InterruptedException {
        while (taken) {
            wait();
        }
        taken = true;
    }

    public synchronized void drop() {
        taken = false;
        notifyAll();
    }
}
