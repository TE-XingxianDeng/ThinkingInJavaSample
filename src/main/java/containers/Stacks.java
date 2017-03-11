package containers;

import java.util.LinkedList;
import java.util.Stack;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Demonstration of Stack Class.
 *
 * @author Dylan
 * @version 1.00 8/30/2016 20:54
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (Month m : Month.values())
            stack.push(m.toString());
        print("stack = " + stack);
        // Treating a stack as a Vector:
        stack.addElement("The last line");
        print("element 5 = " + stack.elementAt(5));
        print("popping elements: ");
        while (!stack.empty())
            printnb(stack.pop() + " ");

        // Using a LinkedList as a Stack:
        LinkedList<String> lstack = new LinkedList<String>();
        for (Month m : Month.values())
            lstack.addFirst(m.toString());
        print("lstack = " + lstack);
        while (!lstack.isEmpty())
            printnb(lstack.removeFirst() + " ");

        // Using the Stack class from
        // the Holding your Objects Chapter:
        net.mindview.util.Stack<String> stack2 =
                new net.mindview.util.Stack<String>();
        for (Month m : Month.values())
            stack2.push(m.toString());
        print("lstack = " + stack2);
        while (!stack2.empty())
            printnb(stack2.pop() + " ");
    }
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}
