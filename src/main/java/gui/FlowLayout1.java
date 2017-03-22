package gui;

import javax.swing.*;
import java.awt.*;

import static net.mindview.util.SwingConsole.run;

/**
 * Demonstrates FlowLayout.
 *
 * @author dylan
 * @version 1.00 3/22/17 9:56 PM
 */
public class FlowLayout1 extends JFrame {
    public FlowLayout1() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++)
            add(new JButton("Button " + i));
    }

    public static void main(String[] args) {
        run(new FlowLayout1(), 300, 300);
    }
}
