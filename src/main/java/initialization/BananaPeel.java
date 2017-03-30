package initialization;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}

class Banana {
    void peel(int i) {/* ... */}
}
