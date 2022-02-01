public class morepattern3
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" " + i);
            }
            System.out.println(" ");
        }
    }
}