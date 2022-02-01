import java.util.Scanner;

public class swap
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number ");
        int a = sc.nextInt();
        System.out.println("before swapping the value of a is " + a);
        final Scanner sx = new Scanner(System.in);
        System.out.println("enter the 2nd number ");
        int b = sx.nextInt();
        System.out.println("before swapping the value of b is " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("after swapping the value of a is " + a + "\nand after swapping the value of b is " + b);
        sc.close();
        sx.close();
    }
}