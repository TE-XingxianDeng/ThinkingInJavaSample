package operators;

/**
 * Surprise! Java lets you overflow.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
