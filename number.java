import java.util.Scanner;

public class number
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        for (int a = sc.nextInt(), i = 0; i <= a; ++i) {
            if (i % 10 != 0) {
                System.out.println("values : \n" + i);
            }
        }
        sc.close();
    }
}