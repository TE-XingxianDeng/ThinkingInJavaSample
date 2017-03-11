package arrays;

import java.util.Arrays;

/**
 * Creating multidimensional arrays.
 *
 * @author Dylan
 * @version 1.00 8/7/2016 16:03
 */
public class AssemblingMultidimensionalArrays {
    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = i * j;  // Autoboxing
        }
        System.out.println(Arrays.deepToString(a));
    }
}
