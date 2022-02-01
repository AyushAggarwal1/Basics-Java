import java.util.Scanner;
public class subtract
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st no. : ");
        final int a = sc.nextInt();
        final Scanner sx = new Scanner(System.in);
        System.out.println("please enter the 2nd no. : ");
        final int b = sx.nextInt();
        final int c = a - b;
        System.out.println("you enter 'a' : " + a + "\n'b' : " + b);
        System.out.println("the subtraction is 'c' : " + c);
        sc.close();
        sx.close();
    }
}