package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Testing the Pool class
 *
 * @author Dylan
 * @version 1.00 7/9/2016 12:59
 */
public class SemaphoreDemo {
    final static int SIZE = 25;

    public static void main(String[] args) throws Exception {
        final Pool<Fat> pool = new Pool<Fat>(Fat.class, SIZE);
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < SIZE; i++)
            exec.execute(new CheckoutTask<Fat>(pool));
        print("All checkoutTasks created");
        List<Fat> list = new ArrayList<Fat>();
        for (int i = 0; i < SIZE; i++) {
            Fat f = pool.checkOut();
            printnb(i + ": main() thread checked out ");
            f.operation();
            list.add(f);
        }
        Future<?> blocked = exec.submit(new Runnable() {
            public void run() {
                try {
                    // Semaphore prevents additional checkout.
                    // so call is blocked:
                    pool.checkOut();
                } catch (InterruptedException e) {
                    print("checkOut() Interrupted");
                }
            }
        });
        TimeUnit.SECONDS.sleep(2);
        blocked.cancel(true);  // Break out of blocked call
        print("Checking in objects in " + list);
        for (Fat f : list)
            pool.checkIn(f);
        for (Fat f : list)
            pool.checkIn(f);  // Second checkIn ignored
        exec.shutdown();
    }
}

class CheckoutTask<T> implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private Pool<T> pool;

    public CheckoutTask(Pool<T> pool) {
        this.pool = pool;
    }

    public void run() {
        try {
            T item = pool.checkOut();
            print(this + "checked out " + item);
            TimeUnit.SECONDS.sleep(1);
            print(this + "checking in " + item);
            pool.checkIn(item);
        } catch (InterruptedException e) {
            // Acceptable way to terminate
        }
    }

    @Override
    public String toString() {
        return "CheckoutTask " + id + " ";
    }
}
