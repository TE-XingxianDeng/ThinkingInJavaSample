package initialization;

/**
 * Constructors can have arguments.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
}

class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}
