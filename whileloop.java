import java.util.Scanner;

public class whileloop
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number less than 10 :");
        int a = sc.nextInt();
        if (a <= 10) {
            while (a < 10) {
                System.out.println(a);
                ++a;
            }
        }
        else {
            System.out.println("type number less than 10");
        }
        sc.close();
    }
}