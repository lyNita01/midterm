import java.text.DateFormatSymbols;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.next();
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));
        String monthName = new DateFormatSymbols().getMonths()[month - 1];
        String fullDate = monthName + " " + day + ", " + year;
        System.out.println("Full Date: " + fullDate);
    }
}

