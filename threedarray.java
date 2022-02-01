public class threedarray
{
    public static void main(final String[] args) {
        final int[][][] a = new int[4][4][4];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                for (int k = 0; k < a.length; ++k) {
                    a[i][j][k] = i + j + k;
                }
            }
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                for (int k = 0; k < a.length; ++k) {
                    System.out.println(" " + a[i][j][k]);
                }
            }
        }
    }
}