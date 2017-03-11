package net.mindview.util;

/**
 * @author dylan
 * @version 1.00 7/23/16 10:09 PM
 */
public class FiveTuple<A, B, C, D, E>
        extends FourTuple<A, B, C, D> {
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ")";
    }
}
