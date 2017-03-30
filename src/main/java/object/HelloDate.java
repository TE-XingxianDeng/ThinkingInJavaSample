package object;

import java.util.Date;

/**
 * The first Thinking in Java example program.
 * Displays a string and today's date.
 *
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /**
     * Entry point to class &amp; application.
     *
     * @param args array of string arguments
     * @throws Exception No exceptions thrown
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
