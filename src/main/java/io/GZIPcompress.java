package io;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author Dylan.Deng
 * @version 1.00 09-15-2016
 */
public class GZIPcompress {
    public static void main(String[] args)
            throws IOException {
        if (args.length == 0) {
            System.out.println(
                    "Usage: \nGZIPcompress file\n" +
                            "\tUses GZIP compression to compress " +
                            "the file to test.gz");
            System.exit(1);
        }
        BufferedReader in = new BufferedReader(
                new FileReader(args[0]));
        BufferedOutputStream out = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream("target/classes/io/test.gz")));
        System.out.println("Writing file");
        int c;
        while ((c = in.read()) != -1)
            out.write(c);
        in.close();
        out.close();
        System.out.println("Reading file");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream(
                                        "target/classes/io/test.gz"))));
        String s;
        while ((s = in2.readLine()) != null)
            System.out.println(s);
    }
}
