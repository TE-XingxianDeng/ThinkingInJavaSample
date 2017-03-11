package generics;

/**
 * @author Dylan
 * @version 1.00 7/30/2016 21:46
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);  // Call with captured type
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        // f1();  // Produces warnings
        f2(raw);  // No Warnings
        Holder rawBasic = new Holder();
        rawBasic.set(new Object());  // Warning
        f2(rawBasic);  // No Warnings
        // Upcast to HolderK?>, still figures it out:
        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
}
