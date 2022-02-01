import java.util.Scanner;

public class factorial
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number to find factorial : ");
        final int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; ++i) {
            b *= i;
        }
        System.out.println("factorial is : " + b);
        sc.close();
    }
}