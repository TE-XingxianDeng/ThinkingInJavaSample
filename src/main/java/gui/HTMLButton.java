package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static net.mindview.util.SwingConsole.run;

/**
 * Putting HTML text on Swing components.
 *
 * @author dylan
 * @version 1.00 4/7/17 3:09 PM
 */
public class HTMLButton extends JFrame {
    private JButton b = new JButton(
            "<html><b><font size=+2>" +
                    "<center>Hello!<br><i>Press me now!");

    public HTMLButton() {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add(new JLabel("<html>" +
                        "<i><font size=+4>Kapow!"));
                // Force a re-layout to include the new label:
                validate();
            }
        });
        setLayout(new FlowLayout());
        add(b);
    }

    public static void main(String[] args) {
        run(new HTMLButton(), 200, 500);
    }
}