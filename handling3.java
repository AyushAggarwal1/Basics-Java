import java.util.Scanner;

public class handling3
{
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the total numbers you want to enter : ");
        final int a = sc.nextInt();
        final int[] i = new int[100];
        int sum = 0;
        if (a != 5) {
            sc.close();
            throw new Exception("enter total numbers be 5");
        }
        if (a > 5) {
            sc.close();
            throw new Exception("enter total numbers be 5");
        }
        for (int b = 0; b < a; ++b) {
            i[b] = sc.nextInt();
        }
        for (int b = 0; b < a; ++b) {
            sum += i[b];
        }
        System.out.println("sum of 5 numbers you enter is : " + sum);
        sc.close();
    }
}