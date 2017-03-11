package enumerated;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

enum Shrubbery {
    GROUND, CRAWLING, HANGING
}

/**
 * Capabilities of the Enum class
 *
 * @author Dylan.Deng
 * @version 1.00 9/17/2016 14:33
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            print(s + " ordinal: " + s.ordinal());
            printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
            printnb(s.equals(Shrubbery.CRAWLING) + " ");
            print(s == Shrubbery.CRAWLING);
            print(s.getDeclaringClass());
            print(s.name());
            print("---------------------------");
        }
        // Produce an enum value from a string name:
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            print(shrub);
        }
    }
}
