import java.util.Scanner;

class Circle {
    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}

public class Question13 {
    static Circle computeArea(double radius) {
        return new Circle(radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Circle circle = computeArea(radius);
        System.out.println("Radius = " + circle.radius);
        System.out.printf("Area = %.2f%n", circle.area);
        sc.close();
    }
}
