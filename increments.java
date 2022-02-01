import java.util.Scanner;
public class increments
{
    public static void main(final String[] a) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number 'n' : ");
        int n = sc.nextInt();
        System.out.println("before increment the value of n is " + n);
        final int b = n++;
        final int s = ++n;
        System.out.println("the value of s is " + s + "\nthe value of b is " + b + "\nafter increment the value of n is " + n);
        sc.close();
    }
}