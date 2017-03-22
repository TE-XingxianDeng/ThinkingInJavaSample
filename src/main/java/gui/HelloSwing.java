package gui;

import javax.swing.*;

/**
 * @author dylan
 * @version 1.00 3/12/17 2:40 PM
 */
public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
