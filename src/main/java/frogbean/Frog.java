package frogbean;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/**
 * @author dylan
 * @version 1.00 4/7/17 7:26 PM
 */
public class Frog {
    private int jumps;
    private Color color;
    private Spots spots;
    private boolean jmpr;

    public int getJumps() {
        return jumps;
    }

    public void setJumps(int newJumps) {
        jumps = newJumps;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    public Spots getSpots() {
        return spots;
    }

    public void setSpots(Spots newSpots) {
        spots = newSpots;
    }

    public boolean isJmper() {
        return jmpr;
    }

    public void setJmper(boolean j) {
        jmpr = j;
    }

    public void addActionListener(ActionListener l) {
        // ...
    }

    public void removeActionListener(ActionListener l) {
        // ...
    }

    public void addKeyListener(KeyListener l) {
        // ...
    }

    public void removeKeyListener(KeyListener l) {
        // ...
    }

    // An "ordinary" public method:
    public void croak() {
        System.out.println("Ribbet!");
    }
}

class Spots {
}