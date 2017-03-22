package gui;

import javax.swing.*;
import java.awt.*;

import static net.mindview.util.SwingConsole.run;

/**
 * Demonstrate BorderLayout.
 *
 * @author dylan
 * @version 1.00 3/22/17 9:53 PM
 */
public class BorderLayout1 extends JFrame {
    public BorderLayout1() {
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));
    }

    public static void main(String[] args) {
        run(new BorderLayout1(), 300, 250);
    }
}
