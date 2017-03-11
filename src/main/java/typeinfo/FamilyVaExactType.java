package typeinfo;

class Base {
}

class Derived extends Base {
}

/**
 * @author Dylan
 * @version 1.00 6/19/2016 17:14
 */
public class FamilyVaExactType {
    static void println(Object obj) {
        System.out.println(obj);
    }

    static void test(Object x) {
        println("Testing x of type " + x.getClass());
        println("x instanceof Base " + (x instanceof Base));
        println("x instanceof Derived " + (x instanceof Derived));
        println("Base.isInstance(x) " + Base.class.isInstance(x));
        println("Derived.isInstance(x) " +
                Derived.class.isInstance(x));
        println("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        println("x.getClass() == Derived.class " +
                (x.getClass() == Derived.class));
        println("x.getClass().equals(Base.class) " +
                (x.getClass().equals(Base.class)));
        println("x.getClass().equals(Derived.class) " +
                (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}
