public class array2
{
    public static void main(final String[] args) {
        final int[] a = new int[5];
        for (int i = 0; i < a.length; ++i) {
            a[i] = i + 1;
        }
        for (final int j : a) {
            System.out.print(j + " ");
        }
    }
}