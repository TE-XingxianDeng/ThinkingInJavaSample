package string;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author Dylan
 * @version 1.00 5/28/2016 21:38
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
}
