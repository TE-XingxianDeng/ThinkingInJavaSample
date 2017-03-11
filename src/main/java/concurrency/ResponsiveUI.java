package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 14:40
 */
public class ResponsiveUI extends Thread{
    private static volatile double d = 1;
    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true)
            d = d + (Math.PI + Math.E) / d;
    }

    public static void main(String[] args) throws Exception{
        //! new UnresponsiveUI();  // Must kill this process
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}

class UnResponsiveUI {
    private volatile double d = 1;
    public UnResponsiveUI() throws Exception {
        while (d > 0)
            d = d + (Math.PI + Math.E) / d;
        System.in.read(); // Never gets here
    }
}
