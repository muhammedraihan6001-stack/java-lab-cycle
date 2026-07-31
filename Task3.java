import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Consuming a token means removing it from the scanner's input buffer,
         * so the next read sees the following token instead of the same one again.
         * The first three hasNextInt() calls all return the same result because
         * they only inspect the current token and do not remove it from the buffer.
         */

        System.out.print("Enter a number: ");

        System.out.println(sc.hasNextInt());
        System.out.println(sc.hasNextInt());
        System.out.println(sc.hasNextInt());

        int value = sc.nextInt();
        System.out.println("Value read: " + value);

        System.out.println(sc.hasNextInt());

        sc.close();
    }
}
