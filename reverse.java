import java.util.Scanner;

class reverse
{
    public static void main(final String[] args) {
        int c = 0;
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number : ");
        int b;
        for (int a = sc.nextInt(); a > 0; a /= 10, c = c * 10 + b) {
            b = a % 10;
        }
        System.out.println("reverse number is " + c);
        sc.close();
    }
}