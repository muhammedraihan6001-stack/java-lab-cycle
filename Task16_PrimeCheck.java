import java.util.Scanner;

public class Task16_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is Not Prime");
            sc.close();
            return;
        }
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { prime = false; break; }
        }
        System.out.println(n + (prime ? " is Prime" : " is Not Prime"));
        sc.close();
    }
}