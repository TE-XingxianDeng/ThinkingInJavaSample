package object;

/**
 * @author dylan
 * @version 1.00 3/11/17 10:15 PM
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
