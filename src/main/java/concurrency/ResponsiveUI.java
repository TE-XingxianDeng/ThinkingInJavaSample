package concurrency;

/**
 * @author dylan
 * @version 1.00 3/10/17 2:39 PM
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() throws Exception {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws Exception {
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}

class UnresponsiveUI {
    private volatile double d = 1;

    public UnresponsiveUI() throws Exception {
        while (d > 0)
            d = d + (Math.PI + Math.E) / d;
        System.in.read(); //Never gets here
    }
}