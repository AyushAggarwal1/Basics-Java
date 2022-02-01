import java.util.Scanner;

public class armstrongnumber
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        final int a;
        int number = a = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            final int b = number % 10;
            System.out.println("value of b" + b);
            number /= 10;
            System.out.println("value of number" + number);
            sum += b * b * b;
        }
        if (sum == a) {
            System.out.println("it is a armstrong number");
        }
        else {
            System.out.println("it is not a armstrong number");
        }
        sc.close();
    }
}