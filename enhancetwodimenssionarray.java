public class enhancetwodimenssionarray
{
    public static void main(final String[] args) {
        int array[][]={ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (final int[] array2 : array) {
            for (final int j : array2) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}