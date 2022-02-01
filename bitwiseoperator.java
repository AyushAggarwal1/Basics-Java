import java.util.Scanner;


public class bitwiseoperator
{
    public static void main(final String[] a) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number 'a' : ");
        final int A = sc.nextInt();
        final Scanner sx = new Scanner(System.in);
        System.out.println("enter the 2nd number 'b' : ");
        final int b = sx.nextInt();
        final int c = A | b;
        final int d = A & b;
        System.out.println("the value of c is " + c + "\nthe value of d is " + d);
        sc.close();
        sx.close();
    }
}