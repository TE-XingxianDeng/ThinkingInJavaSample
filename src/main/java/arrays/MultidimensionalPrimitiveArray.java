package arrays;

import java.util.Arrays;

/**
 * Creating multidimensional arrays.
 *
 * @author Dylan
 * @version 1.00 8/7/2016 15:26
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3,},
                {4, 5, 6,},
        };
        System.out.println(Arrays.deepToString(a));
    }
}
