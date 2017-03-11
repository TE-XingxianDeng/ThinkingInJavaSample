package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Autoboxing compensates for the inability to use
 * primitives in generics.
 *
 * @author Dylan.Deng
 * @version 1.00 2016-07-39
 */
public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)
            li.add(i);
        for (int i : li)
            System.out.print(i + " ");
    }
}