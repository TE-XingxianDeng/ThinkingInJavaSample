package operators;

/**
 * Default equals() does not compare contents.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}

class Value {
    int i;
}