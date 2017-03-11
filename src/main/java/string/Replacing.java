package string;
import static java.lang.System.out;

/**
 * @author dylan
 * @version 1.00 5/22/16 9:27 PM
 */
public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args) {
        out.println(s.replaceFirst("f\\w+", "located"));
        out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
