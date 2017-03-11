package containers;

/**
 * Framework for performing timed tests of containers.
 *
 * @author Dylan
 * @version 1.00 8/28/2016 21:34
 */
public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    // Override this method for different tests.
    // Returns actual number of repetitions of test.
    abstract int test(C container, TestParam tp);
}
