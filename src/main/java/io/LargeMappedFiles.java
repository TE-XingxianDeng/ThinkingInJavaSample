package io;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Creating a very large file using mapping
 *
 * @author Dylan.Deng
 * @version 1.00 09-15-2016
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFFF;  // 128M

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out = new RandomAccessFile(
                "target/classes/io/test.dat", "rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++)
            out.put((byte) 'x');
        print("Finished Writing");
        for (int i = length / 2; i < length / 2 + 6; i++)
            printnb((char) out.get(i));
    }
}
