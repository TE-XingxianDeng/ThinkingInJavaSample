package io;

import java.io.*;

/**
 * Demonstrates standard I/O redirection.
 *
 * @author Dylan.Deng
 * @version 16-9-14
 */
public class Redirecting {
    public static void main(String[] args)
            throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(
                        "src/main/java/io/Redirecting.java"));
        PrintStream out = new PrintStream(
                new FileOutputStream(
                        "target/classes/io/test.out"));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close();  // Remember this!
        System.setOut(console);
    }
}
