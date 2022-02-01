import java.util.Scanner;

public class operations
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st number : ");
        final int a = sc.nextInt();
        final Scanner sx = new Scanner(System.in);
        System.out.println("please enter the 2nd number : ");
        final int b = sx.nextInt();
        final double c = a / (double)b;
        System.out.println("addition is : " + (a + b));
        System.out.println("substraction is : " + (a - b));
        System.out.println("multiplication is : " + a * b);
        System.out.println("division is : " + c);
        System.out.println("modulus is : " + a % b);
        sc.close();
        sx.close();
    }
}