package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 14:03
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
