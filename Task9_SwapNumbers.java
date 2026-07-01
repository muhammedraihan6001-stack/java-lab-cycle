import java.util.Scanner;

public class Task9_SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap\nA = " + a + "\nB = " + b + "\n");
        // using temp
        int ta = a, tb = b;
        int temp = ta;
        ta = tb;
        tb = temp;
        System.out.println("After Swap (using temp)\nA = " + ta + "\nB = " + tb + "\n");
        // without temp
        int x = a, y = b;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap (without temp)\nA = " + x + "\nB = " + y);
        sc.close();
    }
}