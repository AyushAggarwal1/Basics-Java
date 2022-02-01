import java.util.Scanner;

public class secondlargestarray
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array");
        final int a = sc.nextInt();
        final int[] arr = new int[a];
        System.out.println("enter the elements");
        for (int i = 0; i < a; ++i) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int second = arr[0];
        for (int j = 1; j < arr.length; ++j) {
            if (arr[j] >= largest) {
                second = largest;
                largest = arr[j];
            }
            else if (second < arr[j]) {
                second = arr[j];
            }
        }
        System.out.println("second largest number is : " + second + "\nlargest number is : " + largest);
        sc.close();
    }
}