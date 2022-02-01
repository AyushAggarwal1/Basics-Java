public class handling2
{
    public static void main(final String[] args) {
        try {
            final int[] a = new int[5];
            a[5] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task1 is completed");
        }
        catch (ArithmeticException e2) {
            System.out.println("task 2 completed");
        }
        catch (Exception e3) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }
}