package gui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * @author dylan
 * @version 1.00 3/12/17 2:51 PM
 */
public class SubmitSwingProgram extends JFrame {
    JLabel label;

    public SubmitSwingProgram() {
        super("Hello Swing");
        label = new JLabel("A Label");
        add(label);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new SubmitSwingProgram();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Hey! This is Different!");
            }
        });
    }
}
