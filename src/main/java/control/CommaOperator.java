package control;

/**
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
