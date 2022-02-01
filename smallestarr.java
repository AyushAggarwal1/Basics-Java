import java.util.Scanner;

public class smallestarr
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        final int a = sc.nextInt();
        final int[] arr = new int[a];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        for (int j = 1; j < arr.length; ++j) {
            if (arr[j] <= smallest) {
                smallest = arr[j];
            }
        }
        System.out.println(smallest);
        sc.close();
    }
}