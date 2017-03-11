package arrays;

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}

/**
 * @author Dylan.Deng
 * @version 1.00 2016-08-07
 */
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] ints2 =
                new ClassParameter<Integer>().f(ints);
        Double[] doubles2 =
                new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);
    }
}
