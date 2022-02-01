public class asciivalue2
{
    public static void main(final String[] args) {
        for (int a = 0; a < 128; ++a) {
            System.out.printf("%d : %c \n", a, a);
        }
    }
}