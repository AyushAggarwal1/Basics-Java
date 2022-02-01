import java.util.Scanner;
// import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;


public class file1
{
    public static void main(final String[] args) {
        File f = null;
        try {
            f = new File("file.txt");
            final FileWriter w = new FileWriter(f);
            final BufferedWriter b = new BufferedWriter(w);
            System.out.println("enter string");
            final Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                b.write(sc.nextLine());
                b.newLine();
            }
            b.close();
            sc.close();
        }
        catch (Exception e) {
            System.out.println("errorrrrrrr");
        }
    }
}