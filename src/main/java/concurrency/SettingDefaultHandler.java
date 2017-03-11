package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 11:19
 */
public class SettingDefaultHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
