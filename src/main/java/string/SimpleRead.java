package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @author dylan
 * @version 1.00 5/28/16 11:08 PM
 */
public class SimpleRead {
    public static BufferedReader input = new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803"));
    public static void main(String[] args) {
        try {
            sop("What is your name?");
            String name = input.readLine();
            sop(name);
            sop(
                    "How old are you? What is you favorite double?");
            sop("(input: <age> <double>)");
            String numbers = input.readLine();
            sop(numbers);
            String[] numArray = numbers.split(" ");
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.format("Hi %s.\n", name);
            System.out.format("In 5 years you will be %d.\n",
                    age + 5);
            System.out.format("My favorite double is %f",
                    favorite / 2);
        } catch (IOException e) {
            System.err.println("I/O exception");
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
