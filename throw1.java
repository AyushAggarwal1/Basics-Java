public class throw1
{
    static void A(final int a) {
        try {
            if (a < 21) {
                throw new ArrayIndexOutOfBoundsException("not valid");
            }
            System.out.println("hello programmer");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(final String[] args) {
        A(23);
        System.out.println("you are in main funcion");
    }
}