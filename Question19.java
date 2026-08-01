import java.util.Scanner;

public class Question19 {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));
        sc.close();
    }
}
