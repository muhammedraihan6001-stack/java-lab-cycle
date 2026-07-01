import java.util.Scanner;

public class Task7_CountPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int pos=0, neg=0, zero=0;
        for (int i=0;i<n;i++){
            int v = sc.nextInt();
            if (v>0) pos++;
            else if (v<0) neg++;
            else zero++;
        }
        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
        System.out.println("Zeros = " + zero);
        sc.close();
    }
}