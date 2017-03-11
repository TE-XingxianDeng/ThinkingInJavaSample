package enumerated;

import static net.mindview.util.Print.print;


enum LikeClasses {
    WINKEN {
        @Override
        void behavior() {
            print("Behavior1");
        }
    },
    BLINKEN {
        @Override
        void behavior() {
            print("Behavior2");
        }
    },
    NOD {
        @Override
        void behavior() {
            print("Behavior2");
        }
    };

    abstract void behavior();
}

/**
 * @author Dylan.Deng
 * @version 1.00 09-18-2016
 */
public class NotClasses {
    // void f1(LikeClasses.WINKEN instence) {}  // Nope
}
