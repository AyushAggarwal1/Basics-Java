import java.util.Scanner;

public class pallindrone
{
    public static void main(final String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int d;
            int a;
            int c;
            int b;
            for (a = (d = sc.nextInt()), c = 0; a > 0; a /= 10, c = c * 10 + b) 
            {
                b = a % 10;
            }
            if (d == c) 
            {
                System.out.println("number is pallindrone");
            }
            else 
            {
                System.out.println("number is not pallindone");
            }
        }
    }
}