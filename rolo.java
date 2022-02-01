import java.util.Scanner;

public class rolo
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st number : ");
        final int a = sc.nextInt();
        System.out.println("please enter the 2nd number : ");
        final int b = sc.nextInt();
        System.out.println("relational operation are : ");
        System.out.println("a>b : " + (a > b));
        System.out.println("a<b : " + (a < b));
        System.out.println("a>=b : " + (a >= b));
        System.out.println("a<=b : " + (a <= b));
        System.out.println("a==b : " + (a == b));
        System.out.println("a!=b : " + (a != b));

        final boolean c = true;
        final boolean d = true;
        
        System.out.println("logical operations : ");
        System.out.println("c&&d : " + (c && d));
        System.out.println("c||d : " + (c || d));
        System.out.println("!(c&&d) : " + (!c || !d));
        System.out.println("!(c||d) : " + (!c && !d));
        sc.close();
    }
}