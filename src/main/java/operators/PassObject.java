package operators;

import static net.mindview.util.Print.print;

/**
 * Passing objects to methods may not be
 * what you're used to.
 *
 * @author Dylan
 * @version 1.00 3/28/2017
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}

class Letter {
    char c;
}
