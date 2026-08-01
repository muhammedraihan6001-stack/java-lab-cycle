import java.util.Scanner;

public class Question8 {
    static void display(int num) {
        System.out.println("Integer : " + num);
    }

    static void display(double num) {
        System.out.println("Double : " + num);
    }

    static void display(String str) {
        System.out.println("String : " + str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer: ");
        int a = sc.nextInt();
        System.out.print("Double: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("String: ");
        String s = sc.nextLine();

        display(a);
        display(b);
        display(s);
        sc.close();
    }
}
