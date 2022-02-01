import java.io.BufferedReader;
import java.io.FileReader;

public class fileDemo
{
    public static void main(final String[] args) {
        final String filename = "file.txt";
        try {
            final BufferedReader b = new BufferedReader(new FileReader(filename));
            System.out.println("The contents of the file are: ");
            String sr;
            while ((sr = b.readLine()) != null) {
                System.out.println(sr);
            }
            b.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}