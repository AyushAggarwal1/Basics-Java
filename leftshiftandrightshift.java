import java.util.Scanner;

public class leftshiftandrightshift
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of 'a' : ");
        final int a = sc.nextInt();
        final int b = a << 3;
        final int c = a >> 3;
        System.out.println("value of 'a' is : " + a + "\nthe value of 'left shift (b)' is : " + b + "\nthe value of 'right shift (c)' : " + c);
        sc.close();
    }
}