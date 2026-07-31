import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        int age = 0;

        // Keep asking for age until the user enters a valid integer.
        while (true) {
            System.out.print("Enter age: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid age! Please enter an integer.");
                sc.next(); // Discard the invalid token so the next prompt can read again.
                continue;
            }
            age = sc.nextInt();
            break;
        }

        double marks = 0.0;

        // Keep asking for marks until the user enters a valid number.
        while (true) {
            System.out.print("Enter marks: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid marks! Please enter a number.");
                sc.next(); // Discard the invalid token so the next prompt can read again.
                continue;
            }
            marks = sc.nextDouble();
            break;
        }

        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);

        sc.close();
    }
}
