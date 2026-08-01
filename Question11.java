import java.util.Scanner;

class Box {
    int length;
    int breadth;
    int height;

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }
}

public class Question11 {
    static void largerBox(Box b1, Box b2) {
        int v1 = b1.volume();
        int v2 = b2.volume();
        if (v1 > v2) {
            System.out.println("Larger Box Volume = " + v1);
        } else {
            System.out.println("Larger Box Volume = " + v2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Box1: ");
        int l1 = sc.nextInt();
        int b1 = sc.nextInt();
        int h1 = sc.nextInt();
        System.out.println("Box2: ");
        int l2 = sc.nextInt();
        int b2 = sc.nextInt();
        int h2 = sc.nextInt();

        Box box1 = new Box(l1, b1, h1);
        Box box2 = new Box(l2, b2, h2);
        largerBox(box1, box2);
        sc.close();
    }
}
