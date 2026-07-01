import java.util.Scanner;

public class Task1_StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Roll No:");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course:");
        String course = sc.nextLine();
        System.out.println("Enter Percentage:");
        double perc = sc.nextDouble();

        System.out.println("Student Details\n\n---------------\n");
        System.out.printf("Name       : %s\n\n", name);
        System.out.printf("Roll No    : %d\n\n", roll);
        System.out.printf("Course     : %s\n\n", course);
        System.out.printf("Percentage : %s\n", String.valueOf(perc));
        sc.close();
    }
}