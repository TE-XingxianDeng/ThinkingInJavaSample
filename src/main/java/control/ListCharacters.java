package control;

/**
 * Demonstrates "for" loop by listing
 * all the lowercase ASCII letters.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int) c +
                        " character: " + c);
    }
}
