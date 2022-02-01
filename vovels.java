import java.util.Scanner;

public class vovels
{
    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.print("Input an alphabet:");
        char ch = s.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch > 'z' || ch < 'a') {
            System.out.println("Error:Not an alphabet");
        }
        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonent");
        }
        s.close();
    }
}