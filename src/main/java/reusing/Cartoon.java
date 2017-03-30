package reusing;

import static net.mindview.util.Print.print;

/**
 * Constructor calls during inheritance.
 *
 * @author Dylan
 * @version 1.00 3/30/2017
 */
public class Cartoon {
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}