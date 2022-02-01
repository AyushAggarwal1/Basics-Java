import java.util.Scanner;

public class greaternumber
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the ist number");
        final int a = sc.nextInt();
        System.out.println("please enter the second number");
        final int b = sc.nextInt();
        System.out.println("please enter the third number");
        final int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greatest number");
        }
        else if (b > a && b > c) {
            System.out.println("b is greatest number");
        }
        else if (c > a && c > b) {
            System.out.println("c is greatest number");
        }
        else {
            System.out.println("all are equal");
        }
        sc.close();
    }
}