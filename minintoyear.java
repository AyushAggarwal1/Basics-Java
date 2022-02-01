import java.util.Scanner;

public class minintoyear
{
    public static void main(final String[] Strings) {
        final double minutesInYear = 525600.0;
        final double minutesInMonth = 17280.0;
        final double minutesIndays = 1440.0;
        final Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        final int min = input.nextInt();
        final long years = (long)(min / minutesInYear);
        final long months = (long)(min / minutesInMonth);
        final int days = (int)(min / minutesIndays % 365.0);
        System.out.println(min + " minutes is approximately " + years + " years and " + months + " months and " + days + " days");
        input.close();
    }
}