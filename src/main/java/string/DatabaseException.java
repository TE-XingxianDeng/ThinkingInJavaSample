package string;

/**
 * @author dylan
 * @version 1.00 5/22/16 9:34 PM
 */
public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryId,
                             String message) {
        super(String.format("(t%d, q%d) %s", transactionID,
                queryId, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}