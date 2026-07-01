import java.util.Scanner;

public class Task3_AverageFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3.0;
        System.out.printf("Average = %s\n", avg);
        sc.close();
    }
}