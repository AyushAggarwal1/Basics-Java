import java.util.Scanner;
public class oddeven
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to cheak odd & even");
        final int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        sc.close();
    }
}