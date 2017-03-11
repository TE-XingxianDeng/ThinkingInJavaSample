package containers;

import net.mindview.util.Countries;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Using the Collections.unmodifiable methods.
 *
 * @author Dylan
 * @version 1.00 8/30/2016 19:24
 */
public class ReadOnly {
    static Collection<String> data = new ArrayList<String>(Countries.names(6));

    public static void main(String[] args) {
        Collection<String> c = Collections.unmodifiableCollection(
                new ArrayList<String>(data));
        print(c);  // Raading is OK
        //! c.add("one");  // Can't change it

        List<String> a = Collections.unmodifiableList(
                new ArrayList<String>(data));
        ListIterator<String> lit = a.listIterator();
        print(lit.next());  // Rading is OK
        //! lit.add("one");  // Can't change it

        Set<String> s = Collections.unmodifiableSet(
                new HashSet<String>(data));
        print(s);  // Reading is OK
        //! s.add("one");  // Can't change it

        // For a SortedSet:
        Set<String> ss = Collections.unmodifiableSortedSet(
                new TreeSet<String>(data));

        Map<String, String> m = Collections.unmodifiableMap(
                new HashMap<String, String>(Countries.capitals(6)));
        print(m);  // Reading is OK
        //! m.put("Ralph", "Howdy!");

        // For a SortedMap:
        Map<String, String> sm =
                Collections.unmodifiableSortedMap(
                        new TreeMap<String, String>(Countries.capitals(6)));
    }
}
