import java.util.Scanner;

public class perfectnumbers
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        final int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; ++i) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println("perfect number");
        }
        else {
            System.out.println("not a perfect number");
        }
        sc.close();
    }
}