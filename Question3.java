import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, breadth);

        System.out.println("Rectangle 1 Area = " + rect1.area());
        System.out.println("Rectangle 2 Area = " + rect2.area());
        sc.close();
    }
}
