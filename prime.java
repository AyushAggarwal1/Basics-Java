import java.util.Scanner;
public class prime
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        final int a = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i < a; ++i) {
            if (a % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println(a + " is a prime");
        }
        else {
            System.out.println(a + " is not a prime");
        }
        sc.close();
    }
}