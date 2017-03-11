package enumerated;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author Dylan.Deng
 * @version 1.00 09-18-2016
 */
public enum OverrideConstantSpecific {
    NUT, WOLT, WASHER {
        void f() {
            print("Overridden method");
        }
    };

    void f() {
        print("default bahavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            printnb(ocs + ": ");
            ocs.f();
        }
    }
}
