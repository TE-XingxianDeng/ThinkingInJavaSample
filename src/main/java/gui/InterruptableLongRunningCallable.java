package gui;

import net.mindview.util.TaskItem;
import net.mindview.util.TaskManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

import static net.mindview.util.SwingConsole.run;

/**
 * Using Callables for long-running tasks.
 *
 * @author dylan
 * @version 1.00 4/7/17 6:06 PM
 */
public class InterruptableLongRunningCallable extends JFrame {
    private JButton
            b1 = new JButton("Start Long Running Task"),
            b2 = new JButton("End Long Running Task"),
            b3 = new JButton("Get results");
    private TaskManager<String, CallableTask> manager =
            new TaskManager<>();

    public InterruptableLongRunningCallable() {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CallableTask task = new CallableTask();
                manager.add(task);
                System.out.println(task + " added to the queue");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String result : manager.purge())
                    System.out.println(result);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Sample call to a Task method:
                for (TaskItem<String, CallableTask> tt :
                        manager)
                    tt.task.id();  // No cast required
                for (String result : manager.getResults())
                    System.out.println(result);
            }
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String[] args) {
        run(new InterruptableLongRunningCallable(), 200, 150);
    }
}

class CallableTask extends Task
        implements Callable<String> {
    @Override
    public String call() throws Exception {
        run();
        return "Return value of " + this;
    }
}