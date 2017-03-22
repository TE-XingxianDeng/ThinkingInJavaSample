package gui;

import net.mindview.util.Countries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.SwingConsole.run;

/**
 * Using the JTextArea control
 *
 * @author dylan
 * @version 1.00 3/22/17 9:47 PM
 */
public class TextArea extends JFrame {
    private JButton
            b = new JButton("Add Data"),
            c = new JButton("Clear Data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String, String> m = new HashMap<>();

    public TextArea() {
        m.putAll(Countries.capitals());
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry<String, String> me : m.entrySet()) {
                    t.append(me.getKey() + ": " + me.getValue() + "\n");
                }
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
    }

    public static void main(String[] args) {
        run(new TextArea(), 475, 425);
    }
}
