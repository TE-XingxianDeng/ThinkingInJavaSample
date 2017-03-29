package initialization;

/**
 * Demonstration of a simple constructor.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
}

class Rock {
    Rock() {  // This is the constructor
        System.out.print("Rock ");
    }
}