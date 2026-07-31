import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your age: ");

            // Check whether the next token is an integer before trying to read it.
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // Discard the invalid token so the loop can ask again.
                continue;
            }

            int age = sc.nextInt();

            // Validate the integer value against the allowed age range.
            if (age < 1 || age > 120) {
                System.out.println("Age out of range! Please enter a value between 1 and 120.");
            } else {
                System.out.println("Your age is: " + age);
                break;
            }
        }

        sc.close();
    }
}
