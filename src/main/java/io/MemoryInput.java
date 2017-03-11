package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author dylan
 * @version 1.00 9/10/16 11:31 PM
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src/main/java/io/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
}
