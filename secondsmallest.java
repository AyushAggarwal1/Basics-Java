import java.util.Scanner;

public class secondsmallest
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        final int a = sc.nextInt();
        final int[] array = new int[a];
        for (int i = 0; i < array.length; ++i) {
            array[i] = sc.nextInt();
        }
        int smallest = array[0];
        int second = array[0];
        for (int j = 1; j < array.length; ++j) {
            if (smallest >= array[j]) {
                second = smallest;
                smallest = array[j];
            }
            else if (second > array[j]) {
                second = array[j];
            }
        }
        System.out.println(second);
        sc.close();
    }
}