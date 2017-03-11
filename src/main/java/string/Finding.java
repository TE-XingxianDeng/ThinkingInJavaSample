package string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;
/**
 * @author dylan
 * @version 1.00 5/22/16 11:04 PM
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").
                matcher("Evening is full of the linnet's wings");
        while (m.find()) {
            out.print(m.group() + " ");
        }
        out.println();
        int i = 0;
        while (m.find(i)) {
            out.print(m.group() + " ");
            i++;
        }
    }
}
