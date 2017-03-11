// Allows you to easily try out regular expression.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }
package string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

/**
 * @author dylan
 * @version 1.00 5/22/16 10:02 PM
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            out.println("Usage: \njava TestRegularExpression " +
                "characterSequence regularExpression+");
            System.exit(0);
        }
        out.println("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                out.println("Match \"" + m.group() + "\" at positions " +
                m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
