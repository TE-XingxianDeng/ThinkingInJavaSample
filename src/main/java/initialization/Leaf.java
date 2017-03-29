package initialization;

/**
 * Simple use of the "this" keyword.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
