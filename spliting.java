public class spliting
{
    public static void main(final String[] args) {
        final String A = "abc,bcd,cde,def,efg";
        final String[] B = A.split(",");
        System.out.println(B[2]);
        for (final String S : B) {
            System.out.println(S);
        }
    }
}