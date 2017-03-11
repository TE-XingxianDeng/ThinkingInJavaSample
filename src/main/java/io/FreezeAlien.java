package io;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Create a serialized output file
 *
 * @author Dylan.Deng
 * @version 1.00 09-15-2016
 */
public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("target/classes/io/X.file"));
        Alien quellek = new Alien();
        out.writeObject(quellek);
    }
}
