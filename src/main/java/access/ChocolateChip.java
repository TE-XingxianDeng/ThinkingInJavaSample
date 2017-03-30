package access;

import access.dessert.Cookie;

/**
 * Can't use package-access member from another packages.
 *
 * @author Dylan
 * @version 1.00 3/30/2017
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //! bite();  // Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
