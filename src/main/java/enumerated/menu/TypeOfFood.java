package enumerated.menu;

import static enumerated.menu.Food.*;

/**
 * @author Dylan.Deng
 * @version 1.00 09-17-2016
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
}
