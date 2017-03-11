package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Testing for end of file while reading a byte at a time.
 *
 * @author Dylan.Deng
 * @version 1.00 2016-09-12
 */
public class TestEOF {
    public static void main(String[] args)
            throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/main/java/io/TestEOF.java")));
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}