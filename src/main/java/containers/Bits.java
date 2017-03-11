package containers;

import java.util.BitSet;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Demonstrations of BitSet.
 *
 * @author Dylan
 * @version 1.00 8/30/2016 21:07
 */
public class Bits {
    public static void printBitSet(BitSet b) {
        print("bits: " + b);
        StringBuilder bbits = new StringBuilder();
        for (int j = 0; j < b.size(); j++)
            bbits.append(b.get(j) ? "1" : "0");
        print("bit pattern: " + bbits);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        // Take the LSB of nextInt();
        byte bt = (byte) rand.nextInt();
        BitSet bb = new BitSet();
        for (int i = 7; i >= 0; i--)
            if (((1 << i) & bt) != 0)
                bb.set(i);
            else
                bb.clear();
        print("byte value: " + bt);
        printBitSet(bb);

        short st = (short) rand.nextInt();
        BitSet bs = new BitSet();
        for (int i = 15; i >= 0; i--)
            if (((1 << i) & st) != 0)
                bs.set(i);
            else bs.clear();
        print("short value: " + st);
        printBitSet(bs);

        int it = rand.nextInt();
        BitSet bi = new BitSet();
        for (int i = 31; i >= 0; i--)
            if (((1 << i) & it) != 0)
                bi.set(i);
            else bi.clear();
        print("short value: " + it);
        printBitSet(bi);

        // Test bitsets >= 64 bits:
        BitSet b127 = new BitSet();
        b127.set(127);
        print("set bit 127: " + b127);
        BitSet b255 = new BitSet();
        b255.set(255);
        print("set bit 127: " + b255);
        BitSet b1023 = new BitSet();
        b1023.set(1023);
        print("set bit 127: " + b1023);
    }
}
