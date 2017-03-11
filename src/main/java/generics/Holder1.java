package generics;

/**
 * @author dylan
 * @version 1.00 7/23/16 9:31 PM
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}

class Automobile {
}