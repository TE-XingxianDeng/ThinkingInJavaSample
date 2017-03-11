package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 14:06
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }
}
