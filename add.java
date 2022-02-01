import java.util.Scanner;

public class add
{
    public static void main(final String[] args) {
        final Scanner i = new Scanner(System.in);
        System.out.println("enter the 1st no");
        final int a = i.nextInt();
        final Scanner j = new Scanner(System.in);
        System.out.println("enter the 2nd no");
        final int b = j.nextInt();
        final int c = a + b;
        System.out.println("the addition of no is " + c);
        i.close();
        j.close();
    }
}