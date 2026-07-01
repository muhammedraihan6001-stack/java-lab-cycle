import java.util.Scanner;

public class Task2_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        double p = sc.nextDouble();
        System.out.println("Enter Rate:");
        double r = sc.nextDouble();
        System.out.println("Enter Time (years):");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100.0;
        double amount = p + si;

        if (si == (long) si) System.out.printf("Simple Interest = %d\n", (long) si);
        else System.out.printf("Simple Interest = %s\n", si);
        if (amount == (long) amount) System.out.printf("Amount = %d\n", (long) amount);
        else System.out.printf("Amount = %s\n", amount);
        sc.close();
    }
}