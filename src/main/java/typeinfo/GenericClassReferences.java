package typeinfo;

/**
 * @author Dylan
 * @version 1.00 6/13/2016 20:33
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class;
    }
}
