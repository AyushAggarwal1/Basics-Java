import java.util.Scanner;

public class character
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the character");
        final char a = sc.next().charAt(0);
        System.out.println((int)a);
        sc.close();
    }
}