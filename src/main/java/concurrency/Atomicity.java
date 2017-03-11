package concurrency;

/**
 * @author Dylan
 * @version 1.00 6/27/2016 22:08
 */
public class Atomicity {
    int i;

    void f1() {
        i++;
    }

    void f2() {
        i += 3;
    }
}
