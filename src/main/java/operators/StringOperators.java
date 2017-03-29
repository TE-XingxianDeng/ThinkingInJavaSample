package operators;

import static net.mindview.util.Print.print;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s);  // Converts x to a String
        s += "(summed) = ";  // Concatenation operator
        print(s + (x + y + z));
        print("" + x);  // Shorthand for Integer.toString()
    }
}
