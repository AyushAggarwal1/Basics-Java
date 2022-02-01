import java.util.Scanner;

public class floatcompare
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        float a = sc.nextFloat();
        System.out.println("enter the 2nd number");
        float b = sc.nextFloat();
        double f = 0.0;
        a *= 1000.0f;
        double a2 = Math.round(a);
        a2 %= 1000.0;
        b *= 1000.0f;
        double b2 = Math.round(b);
        b2 %= 1000.0;
        for (int i = 2; i >= 0; --i) {
            final double p = a2 / Math.pow(10.0, i);
            a2 %= Math.pow(10.0, i);
            final double q = b2 / Math.pow(10.0, i);
            b2 %= Math.pow(10.0, i);
            if ((int)p != (int)q) {
                break;
            }
            ++f;
        }
        System.out.println("decimal places are same upto " + f);
        sc.close();
    }
}