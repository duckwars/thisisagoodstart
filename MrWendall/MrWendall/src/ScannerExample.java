import java.util.Scanner;

/**
 * This doesn't do anything yet.
 */
public class ScannerExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Keep on typing stuff and hitting enter");

        final Scanner scanner = new Scanner(System.in);
        try {
            while (scanner.hasNext()) {
                final String token = scanner.next();

                doSomethingWithToken(token);
            }
        } finally {
            // Normally good practice to close() in a finally block, but you
            // probably don't want to close System.in.
            // scanner.close();
        }
    }

    private static void doSomethingWithToken(final String token) {
        System.out.println("SARCASM: " + token);
    }
}
