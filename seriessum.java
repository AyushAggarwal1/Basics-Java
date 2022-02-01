import java.util.Scanner;

public class seriessum
{
    public static int fact(final int n) {
        int b = 1;
        for (int i = n; i >= 1; --i) {
            b *= i;
        }
        return b;
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        System.out.println("please enter the number");
        final int num = sc.nextInt();
        System.out.println("please enter the numerator");
        final int x = sc.nextInt();
        for (int i = 1; i <= num; ++i) {
            final double frac = Math.pow(x, i) / fact(i);
            sum += frac;
        }
        System.out.println("the sum is : " + sum);
        sc.close();
    }
}