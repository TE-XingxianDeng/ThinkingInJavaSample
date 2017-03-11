package io;

import net.mindview.util.OSExecute;

/**
 * Demonstrates standard I/O redirection.
 *
 * @author Dylan.Deng
 * @version 16-9-14
 */
public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap target/classes/io/OSExecuteDemo");
    }
}
