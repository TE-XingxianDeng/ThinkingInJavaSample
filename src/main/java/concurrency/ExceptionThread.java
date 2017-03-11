package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 11:06
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
