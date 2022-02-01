import java.util.Scanner;

public class month
{
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number between 1 & 12 : ");
        final int a = sc.nextInt();
        int i=1;
        while(i==1) 
        {
            switch (a) {
                case 1: {
                    System.out.println("january : ");
                    break;
                }
                case 2: {
                    System.out.println("febuary");
                    break;
                }
                case 3: {
                    System.out.println("march");
                    break;
                }
                case 4: {
                    System.out.println("april");
                    break;
                }
                case 5: {
                    System.out.println("may");
                    break;
                }
                case 6: {
                    System.out.println("june");
                    break;
                }
                case 7: {
                    System.out.println("july");
                    break;
                }
                case 8: {
                    System.out.println("august");
                    break;
                }
                case 9: {
                    System.out.println("september");
                    break;
                }
                case 10: {
                    System.out.println("october");
                    break;
                }
                case 11: {
                    System.out.println("november");
                    break;
                }
                case 12: {
                    System.out.println("december");
                    break;
                }
                default: {
                    System.out.println("invalid option \nenter the number between 1 & 12 \nthank you ");
                    break;
                }
            }
            System.out.println("Press N to exit or any other key to continue:");
            final char c = sc.next().charAt(0);
            if (c == 'N') 
            {
                i=0;
            }
        }
        sc.close();
    }
}