package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 14:01
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
