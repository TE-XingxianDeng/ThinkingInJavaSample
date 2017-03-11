package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dylan
 * @version 1.00 5/28/16 10:47 PM
 */
public class Resetting {
    public static void main(String[] args) throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]")
                .matcher("fix the rug with bags)");
        while (m.find())
            System.out.println(m.group() + " ");
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find())
            System.out.println(m.group() + " ");
    }
}
