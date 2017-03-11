package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 14:15
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
