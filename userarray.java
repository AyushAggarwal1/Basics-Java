import java.util.Scanner;

public class userarray
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array : ");
        final int a = sc.nextInt();
        final int[] b = new int[100];
        System.out.println("please enter the elements : ");
        for (int i = 0; i < a; ++i) {
            b[i] = sc.nextInt();
        }
        System.out.println("you entered : ");
        for (int i = 0; i < a; ++i) {
            System.out.println(b[i]);
        }
        sc.close();
    }
}