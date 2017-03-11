package enumerated.cartoons;

import net.mindview.util.Generator;

import java.util.Random;

/**
 * An enum can implement an interface
 *
 * @author dylan
 * @version 1.00 9/17/16 7:42 PM
 */
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.println(rg.next() + ", ");
    }

    public static void main(String[] args) {
        // Choose any instance:
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++)
            printNext(cc);
    }
}

enum CartoonCharacter
        implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);

    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}
