package generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author dylan
 * @version 1.00 7/26/16 8:14 PM
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);  // No warning
        flist.contains(new Apple());  // Argument is 'Object'
        flist.indexOf(new Apple());  // Argument is 'Object'
    }
}
