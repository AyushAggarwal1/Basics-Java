import java.util.Scanner;

public class handling1
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        try {
            System.out.println("try 1 sucessful");
        }
        catch (Exception w) {
            System.out.println(w);
        }
        System.out.println("try 1 complete");
        try {
            System.out.println("enter a number");
            final int d = sc.nextInt();
            final int a = d / 0;
            System.out.println("try 2 sucessful"+a);
        }
        catch (Exception s2) {
            System.out.println(s2);
        }
        System.out.println("try 2 complete");
        try {
            System.out.println("enter a number");
            final int a2 = sc.nextInt();
            final int[] b = new int[10];
            if (b.length < a2) {
                b[a2] = 12;
            }
            else if (a2 < b.length) {
                b[a2] = 32131;
            }
            System.out.println("try 3 sucessful");
        }
        catch (Exception v) {
            System.out.println(v);
        }
        System.out.println("try 3 complete");
        try {
            System.out.println("enter a number");
            final String f = sc.nextLine();
            final int c = Integer.parseInt(f);
            System.out.println("try 4 sucessful"+c);
        }
        catch (Exception p) {
            System.out.println(p);
        }
        System.out.println("try 4 complete");
        sc.close();
    }
}