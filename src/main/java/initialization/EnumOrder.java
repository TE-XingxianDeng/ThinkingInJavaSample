package initialization;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
