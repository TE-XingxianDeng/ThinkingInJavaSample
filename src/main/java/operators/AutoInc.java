package operators;

import static net.mindview.util.Print.*;

/**
 * Demonstrates the ++ and -- operators.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i: " + i);
        print("++i: " + ++i);  // Pre-increment
        print("i++: " + i++);  // Post-increment
        print("i: " + i);
        print("--i: " + --i);  // Pre-decrement
        print("i--: " + i--);  // Post-decrement
        print("i: " + i);
    }
}
