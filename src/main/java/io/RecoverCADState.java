package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Restoring the state of the pretend CAD system
 *
 * @author Dylan.Deng
 * @version 1.00 9/17/2016 12:53
 */
public class RecoverCADState {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
            throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("target/classes/io/CADState.out"));
        // Read in the same order they were written:
        List<Class<? extends Shape>> shapeTypes =
                (List<Class<? extends Shape>>) in.readObject();
        Line.deserializeStaticState(in);
        List<Shape> shapes = (List<Shape>) in.readObject();
        System.out.println(shapes);
    }
}
