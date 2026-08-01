import java.util.Scanner;

public class Question9 {
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Area of Square = " + area(side));
        System.out.println("Area of Rectangle = " + area(length, breadth));
        sc.close();
    }
}
