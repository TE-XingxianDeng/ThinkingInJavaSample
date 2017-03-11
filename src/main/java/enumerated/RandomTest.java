package enumerated;

import net.mindview.util.Enums;

enum Activity {
    SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, JUMPING, FALLING, FLYING
}

/**
 * @author Dylan.Deng
 * @version 1.00 09-17-2016
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.print(Enums.random(Activity.class) + " ");
    }
}
