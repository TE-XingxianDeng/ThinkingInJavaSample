package net.mindview.util;

import java.util.Random;

/**
 * @author dylan
 * @version 1.00 7/9/16 7:26 AM
 */
public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}