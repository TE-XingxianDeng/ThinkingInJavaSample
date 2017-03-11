package io.xfiles;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Try to recover a serialized file without the
 * class of object that's stored in that file.
 *
 * @author Dylan.Deng
 * @version 1.00 09-15-2016
 */
public class ThawAlien {
    public static void main(String[] args)
            throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        "target/classes/io/X.file"));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());
    }
}
