package initialization;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class NoSynthesis {
    public static void main(String[] args) {
        //! Bird2 b = new Bird2();  // No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}

class Bird2 {
    Bird2(int i) {
    }

    Bird2(double d) {
    }
}
