package generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * @author Dylan
 * @version 1.00 7/24/2016 15:02
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
