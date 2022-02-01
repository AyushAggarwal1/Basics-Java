import java.util.Scanner;

public class sumarray
{
    public static void main(final String[] args) {
        int sum = 0;
        final int[] A = new int[10];
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array");
        final int n = sc.nextInt();
        System.out.println("enter the elements");
        for (int i = 0; i < n; ++i) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            sum += A[i];
        }
        System.out.println("sum is " + sum);
        sc.close();
    }
}