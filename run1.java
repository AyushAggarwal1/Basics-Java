public class run1
{
    public static void main(final String[] args) {
        final int[] s = new int[5];
        try {
            for (int i = 0; i < s.length; ++i) {
                s[i] = Integer.parseInt(args[i]);
                if (args.length < 5) {
                    throw new handling4();
                }
                if (args.length > 5) {
                    throw new handling4();
                }
            }
        }
        catch (handling4 e) {
            System.out.println("erorrrrrrrrrrr");
        }
    }
}

class handling4 extends Exception
{}