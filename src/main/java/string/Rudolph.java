package string;

/**
 * @author dylan
 * @version 1.00 5/22/16 9:38 PM
 */
public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[] {
                "Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"
        })
            System.out.println("Rudolph".matches(pattern));
    }
}
