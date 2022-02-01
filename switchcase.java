import java.util.Scanner;

public class switchcase
{
    public static void main(final String[] args) {
        System.out.println("for january,march,may,july,august,october,december type : 1");
        System.out.println("for febuary type : 2");
        System.out.println("for april,june,september,november type : 3");
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int i = 1;
        final int month = sc.nextInt();
        while (i == 1) {
            switch (month) {
                case 1: {
                    System.out.println("you choose first pack");
                    System.out.println("in first pack there are 31 days");
                    break;
                }
                case 2: {
                    System.out.println("you choose second pack");
                    System.out.println("in second pack there are 28 days");
                    break;
                }
                case 3: {
                    System.out.println("you choose third pack");
                    System.out.println("in third pack there are 30 days");
                    break;
                }
                default: {
                    System.out.println("invalid number");
                    break;
                }
            }
            System.out.println("Press N to exit or any other key to continue:");
            final char c = sc.next().charAt(0);
            if (c == 'N') {
                i = 0;
            }
        }
        sc.close();
    }
}