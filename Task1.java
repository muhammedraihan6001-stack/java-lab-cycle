import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        try {
            // Read the age as an integer; if the user types text, this will throw an exception.
            int age = sc.nextInt();
        } catch (InputMismatchException e) {
            // Catch the specific input error caused by non-integer input.
            System.out.println("Error: Please enter a valid integer.");
        } catch (Exception e) {
            // This block is for anything unexpected and should rarely be reached.
            System.out.println("Error: Something unexpected happened.");
        } finally {
            // This always runs so the program does not crash silently.
            System.out.println("Program finished.");
        }

        sc.close();
    }
}
