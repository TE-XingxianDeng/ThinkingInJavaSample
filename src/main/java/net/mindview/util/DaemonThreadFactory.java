package net.mindview.util;

import java.util.concurrent.ThreadFactory;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 12:27
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
