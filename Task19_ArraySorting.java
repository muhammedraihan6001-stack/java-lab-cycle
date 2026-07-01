import java.util.Arrays;
import java.util.Scanner;

public class Task19_ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
        sc.close();
    }
}