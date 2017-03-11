package containers;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Java 1.0/1.1 Vector and Enumeration.
 *
 * @author Dylan
 * @version 1.00 8/30/2016 20:51
 */
public class Enumerations {
    public static void main(String[] args) {
        Vector<String> v =
                new Vector<String>(Countries.names(10));
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
            System.out.print(e.nextElement() + ", ");
        // Produce an Enumeration from a Collection:
        e = Collections.enumeration(new ArrayList<String>());
    }
}
