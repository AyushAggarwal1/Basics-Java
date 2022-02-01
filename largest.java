import java.util.Scanner;
public class largest
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array : ");
        final int a = sc.nextInt();
        final int[] b = new int[a];
        int largest = b[0];
        System.out.println("enter rhe elements : ");
        for (int i = 0; i < a; ++i) {
            b[i] = sc.nextInt();
        }
        for (int i = 1; i < b.length; ++i) {
            if (b[i] >= largest) {
                largest = b[i];
            }
            else {
                largest = largest;
            }
        }
        System.out.println("largest number is : " + largest);
        sc.close();
    }
}