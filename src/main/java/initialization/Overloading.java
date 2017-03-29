package initialization;

import static net.mindview.util.Print.print;

/**
 * Demonstration of both constructor
 * and ordinary method overloading.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
}

class Tree {
    int height;

    Tree() {
        print("Planting a seeding");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }

    void info() {
        print("Tree is " + height + " feet tall");
    }

    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}