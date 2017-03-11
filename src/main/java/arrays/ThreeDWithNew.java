package arrays;

import java.util.Arrays;

/**
 * @author Dylan
 * @version 1.00 8/7/2016 15:30
 */
public class ThreeDWithNew {
    public static void main(String[] args) {
        // 3-D array with fixed length;
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
}
