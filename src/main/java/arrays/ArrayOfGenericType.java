package arrays;

/**
 * Arrays of generic type won't compile.
 *
 * @author Dylan.Deng
 * @version 1.00 2016-08-07
 */
public class ArrayOfGenericType<T> {
    T[] array;  // OK

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        // !array = new T[size];  // Illegal
        array = (T[]) new Object[size];  // "unchekced" Warning
    }
    // Illegal:
    // ! public <U> U[] makeArray() { return new U[10]; }
}