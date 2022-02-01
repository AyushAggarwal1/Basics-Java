public class pattern2
{
    public static void main(final String[] args) {
        for (int a = 1; a <= 4; ++a) {
            for (int b = 1; b <= 4; ++b) {
                if (a == 1 || a == 4 || b == 1 || b == 4) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}