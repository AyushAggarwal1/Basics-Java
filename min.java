import java.util.Scanner;

public class min
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st number");
        final int a = sc.nextInt();
        System.out.println("please enter the 2nd number");
        final int b = sc.nextInt();
        System.out.println("please enter the 3rd number");
        final int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("a is smallest : " + a);
        }
        else if (b < a && b < c) {
            System.out.println("b is smallest : " + b);
        }
        else {
            System.out.println("c is smallest : " + c);
        }
        sc.close();
    }
}