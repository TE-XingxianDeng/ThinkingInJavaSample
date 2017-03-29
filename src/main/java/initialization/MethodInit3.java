package initialization;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class MethodInit3 {
    //! int j = g(i); // Illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
