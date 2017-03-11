package containers;

import static net.mindview.util.Print.print;

/**
 * Does Math.random() produce 0.0 and 1.0?
 *
 * @author Dylan.Deng
 * @version 1.00 2016-08-29
 */
public class RandomBounds {
    static void usage() {
        print("Usage:");
        print("\tRandomBounds lower");
        print("\nRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) usage();
        if (args[0].equals("lower")) {
            while (Math.random() != 1.0)
                ;  // Keep trying
            print("Produced 1.0!");
        } else
            usage();
    }
}