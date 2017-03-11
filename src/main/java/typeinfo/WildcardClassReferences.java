package typeinfo;

/**
 * @author Dylan
 * @version 1.00 6/13/2016 20:36
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
