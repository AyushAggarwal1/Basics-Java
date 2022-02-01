import java.util.Scanner;

public class seperate
{
    public static void main(final String[] args) {
        int i = 1;
        Scanner s = new Scanner(System.in);
        while (i == 1) {
            System.out.println("Input a five digit number:");
            long n = s.nextLong();
            int j = 1;
            while (j == 1) {
                if (n / 10000L == 0L || n > 99999L) {
                    System.out.println("Error:The entered number is not a five digit number\nTry Again:");
                    n = s.nextLong();
                }
                else {
                    j = 0;
                }
            }
            long m = n;
            final long n2 = m / 10000L;
            m -= n2 * 10000L;
            final long n3 = m / 1000L;
            m -= n3 * 1000L;
            final long n4 = m / 100L;
            m -= n4 * 100L;
            final long n5 = m / 10L;
            final long n6 = m % 10L;
            System.out.println("The result is:\n" + n2 + "   " + n3 + "   " + n4 + "   " + n5 + "   " + n6);
            System.out.println("Press N to exit or any other key to continue:");
            final char c = s.next().charAt(0);
            if (c == 'N') {
                i = 0;
            }
        }
        s.close();
    }
}