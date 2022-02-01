import java.util.Random;

public class randomarray
{
    public static void main(final String[] args) {
        final Random r = new Random();
        final int[] a = new int[10];
        for (int i = 0; i < a.length; ++i) {
            a[i] = r.nextInt(10);
        }
        for (final int j : a) {
            System.out.print(j + " ");
        }
    }
}