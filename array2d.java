import java.util.Scanner;

public class array2d
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the no. of rows : ");
        final int a = sc.nextInt();
        System.out.println("please enter the no of columns : ");
        final int c = sc.nextInt();
        final int[][] b = new int[a][c];
        System.out.println("please enter the elements  : ");
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.println("enter the value of element : [" + (i + 1) + "," + (j + 1) + "]");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("you entered : ");
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}