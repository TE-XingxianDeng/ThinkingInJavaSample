package initialization;

import static net.mindview.util.Print.print;

/**
 * Demonstrates initialization order.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }
}

class Window {
    Window(int marker) {
        print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Before constructor

    House() {
        // Show that we’re in the constructor:
        print("House()");
        w3 = new Window(33); // Reinitialize w3
    }

    Window w2 = new Window(2); // After constructor

    void f() {
        print("f()");
    }

    Window w3 = new Window(3); // At end
}