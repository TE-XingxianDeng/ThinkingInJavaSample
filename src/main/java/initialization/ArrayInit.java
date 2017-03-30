package initialization;

import java.util.Arrays;

/**
 * Array initialization.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
