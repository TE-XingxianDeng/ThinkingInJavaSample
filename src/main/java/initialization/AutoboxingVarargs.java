package initialization;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i : args)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11), 12);
    }
}
