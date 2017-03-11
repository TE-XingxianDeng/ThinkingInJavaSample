package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 22:15
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber() {
        return serialNumber++;  // Not thread-safe
    }
}
