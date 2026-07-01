import java.util.Scanner;

public class Task5_EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary:");
        double basic = sc.nextDouble();
        double da = basic * 0.10;
        double hra = basic * 0.15;
        double gross = basic + da + hra;

        System.out.printf("DA = %s\n", (da == (long) da) ? String.valueOf((long) da) : String.valueOf(da));
        System.out.printf("HRA = %s\n", (hra == (long) hra) ? String.valueOf((long) hra) : String.valueOf(hra));
        System.out.printf("Gross Salary = %s\n", (gross == (long) gross) ? String.valueOf((long) gross) : String.valueOf(gross));
        sc.close();
    }
}