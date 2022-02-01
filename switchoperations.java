import java.util.Scanner;

public class switchoperations
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number : ");
        final int a = sc.nextInt();
        System.out.println("please enter the second number : ");
        final int b = sc.nextInt();
        System.out.println("choose : + , - , / , * , % ");
        final char c = sc.next().charAt(0);
        switch (c) {
            case '+': {
                final int d = a + b;
                System.out.println("you choose addition : " + d);
                break;
            }
            case '-': {
                final int d = a - b;
                System.out.println("you choose substraction : " + d);
                break;
            }
            case '/': {
                final int d = a / b;
                System.out.println("you choose division : " + (double)d);
                break;
            }
            case '*': {
                final int d = a * b;
                System.out.println("you choose multiplication : " + d);
                break;
            }
            case '%': {
                final int d = a % b;
                System.out.println("you choose reminder : " + d);
                break;
            }
            default: {
                System.out.println("invalid option\nchoose : + , - , / , * , % ");
                break;
            }
        }
        sc.close();
    }
}