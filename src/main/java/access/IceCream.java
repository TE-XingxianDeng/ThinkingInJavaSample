package access;

/**
 * Demonstrates "private" keyword.
 *
 * @author Dylan
 * @version 1.00 3/30/2017
 */
public class IceCream {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}

class Sundae {
    private Sundae() {
    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}