package concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author Dylan
 * @version 1.00 7/2/2016 19:14
 */
public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static void test(Runnable r) throws InterruptedException {
        Future<?> f = exec.submit(r);
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupting " + r.getClass().getName());
        f.cancel(true);  // Interrupts if running
        System.out.println("Interrupt sent to " + r.getClass().getName());
    }

    public static void main(String[] args) throws Exception {
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlocked());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Aborting with System.exit(0)");
        System.exit(0);  // ... since last 2 interrupts failed
    }
}

class SleepBlocked implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}

class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream is) {
        this.in = is;
    }

    @Override
    public void run() {
        try {
            System.out.println("Waiting for read():");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted from blocked I/O");
            } else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting IOBlocked.run()");
    }
}

class SynchronizedBlocked implements Runnable {
    public synchronized void f() {
        while (true)  // Never releases lock
            Thread.yield();
    }

    public SynchronizedBlocked() {
        new Thread() {
            @Override
            public void run() {
                f();  // Lock acquired by this thread
            }
        }.start();
    }

    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}
