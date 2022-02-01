import java.util.Scanner;

public class quadraticeqn
{
    public static void main(final String[] args) {
        for (int i = 1; i == 1; i = 0) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("enter coeff. of x^2");
                final int a = sc.nextInt();
                System.out.println("enter coeff. of x");
                final int b = sc.nextInt();
                System.out.println("enter coeff. of 1");
                final int c = sc.nextInt();
                double d = b * b - 4 * a * c;
                if (d == 0.0) {
                    System.out.println(-b / 2 * a);
                }
                else if (d > 0.0) {
                    d = Math.pow(d, 0.0);
                    System.out.println("1st root is : " + (-b - d) / 2.0 * a + " second root is : " + (-b + d) / 2.0 * a);
                }
                else {
                    System.out.println("imaginary roots");
                }
                System.out.println("to exit the program press 'N'");
                final char p = sc.next().charAt(0);
                if (p == 'N') {}
            }
        }
        
    }
}