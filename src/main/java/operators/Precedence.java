package operators;

/**
 * @author Dylan
 * @version 1.00 3/28/2017
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a + " b = " + b);
    }
}
