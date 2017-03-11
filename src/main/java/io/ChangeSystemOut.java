package io;

import java.io.PrintWriter;

/**
 * @author Dylan.Deng
 * @version 16-9-14
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world");
    }
}
