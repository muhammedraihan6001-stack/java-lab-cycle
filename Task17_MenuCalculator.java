import java.util.Scanner;

public class Task17_MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double res = 0;
        switch (choice) {
            case 1: res = a + b; break;
            case 2: res = a - b; break;
            case 3: res = a * b; break;
            case 4: res = a / b; break;
            default: System.out.println("Invalid choice"); sc.close(); return;
        }
        System.out.println("Result = " + (res == (long) res ? String.valueOf((long) res) : String.valueOf(res)));
        sc.close();
    }
}