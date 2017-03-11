package enumerated;

enum Search {HITHER, YON}

/**
 * No values() method if you upcast an enum
 *
 * @author dylan
 * @version 1.00 9/17/16 7:33 PM
 */
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;  // Upcast
        // e.values();  // No values() in Enum
        for (Enum en : e.getClass().getEnumConstants())
            System.out.println(en);
    }
}
