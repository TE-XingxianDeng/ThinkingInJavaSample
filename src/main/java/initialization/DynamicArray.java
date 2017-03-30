package initialization;

/**
 * Array initialization.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
}