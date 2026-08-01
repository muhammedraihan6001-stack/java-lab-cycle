import java.util.Scanner;

public class Question20 {
    static final double PI = 3.14159;

    static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        System.out.printf("Area = %.2f%n", areaOfCircle(radius));
        sc.close();
    }
}
