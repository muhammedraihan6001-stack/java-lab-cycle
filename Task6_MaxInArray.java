import java.util.Scanner;

public class Task6_MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        System.out.println("Largest element = " + max);
        sc.close();
    }
}