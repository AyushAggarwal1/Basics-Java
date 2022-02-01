import java.util.Scanner;

public class fibonacci
{
    public static void main(final String[] args) {
        int a = 1;
        int b = 1;
        int k = 0;
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to enter fibonacci series");
        final int n = sc.nextInt();
        System.out.print("0 1 1");
        while (k <= n) {
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }
        sc.close();
    }
}