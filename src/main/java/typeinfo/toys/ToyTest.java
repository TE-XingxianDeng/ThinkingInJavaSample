package typeinfo.toys;

/**
 * @author dylan
 * @version 1.00 5/29/16 2:44 PM
 */
public class ToyTest {
    static void sop(Object o) {
        System.out.println(o.toString());
    }

    static void printInfo(Class cc) {
        sop("Class name: " + cc.getName() +
            " is interface? [" + cc.isInterface() + "]");
        sop("Simple name: " + cc.getSimpleName());
        sop("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            sop("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            sop("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            sop("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
    implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}