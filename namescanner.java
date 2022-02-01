import java.util.Scanner;

public class namescanner
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the name : ");
        final String a = sc.nextLine();
        System.out.println("hello " + a);
        sc.close();
    }
}