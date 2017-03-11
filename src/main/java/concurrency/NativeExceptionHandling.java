package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 11:08
 */
public class NativeExceptionHandling {
    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (RuntimeException ue) {
            // This statement will NOT execute!
            System.out.println("Exception has been handled!");
        }
    }
}
