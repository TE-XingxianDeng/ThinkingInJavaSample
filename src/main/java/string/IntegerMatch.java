package string;
import static java.lang.System.out;
/**
 * @author dylan
 * @version 1.00 5/22/16 9:14 PM
 */
public class IntegerMatch {
    public static void main(String[] args) {
        out.println("-1234".matches("-?\\d+"));
        out.println("5678".matches("-?\\d+"));
        out.println("+911".matches("-?\\d+"));
        out.println("5678".matches("(-|\\+)?\\d+"));
    }
}
