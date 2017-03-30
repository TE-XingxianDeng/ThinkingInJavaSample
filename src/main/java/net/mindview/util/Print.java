package net.mindview.util;

import java.io.PrintStream;
import java.util.Locale;

/**
 * Print methods that can be used without
 * qualifiers, using Java SE5 static imports:
 *
 * @author dylan
 * @version 1.00 7/8/16 11:09 AM
 */
public class Print {
    /**
     * Print a newline by itself
     */
    public static void print() {
        System.out.println();
    }

    /**
     * Print with a newline
     */
    public static void print(Object o) {
        System.out.println(o);
    }

    /**
     * Print with no line break
     */
    public static void printnb(Object o) {
        System.out.print(o);
    }

    public static PrintStream
    printf(Locale l, String format, Object... args) {
        return System.out.printf(l, format, args);
    }

    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
