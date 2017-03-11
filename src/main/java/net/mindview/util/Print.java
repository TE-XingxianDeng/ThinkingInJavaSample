package net.mindview.util;

import java.util.Locale;

/**
 * @author dylan
 * @version 1.00 7/8/16 11:09 AM
 */
public class Print {
    public static void print() {
        System.out.println();
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void printnb(Object o) {
        System.out.print(o);
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void printf(Locale l, String format, Object... args) {
        System.out.printf(l, format, args);
    }
}
