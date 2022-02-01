import java.util.Scanner;
public class p
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        for (int a = sc.nextInt(), i = 0; i < a; ++i) {
            for (int j = 0; j < 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}