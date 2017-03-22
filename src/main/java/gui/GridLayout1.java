package gui;

import javax.swing.*;
import java.awt.*;

import static net.mindview.util.SwingConsole.run;

/**
 * Demonstrates GridLayout
 *
 * @author dylan
 * @version 1.00 3/22/17 9:59 PM
 */
public class GridLayout1 extends JFrame {
    public GridLayout1() {
        setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 20; i++)
            add(new JButton("Button " + i));
    }

    public static void main(String[] args) {
        run(new GridLayout1(), 300, 300);
    }
}
