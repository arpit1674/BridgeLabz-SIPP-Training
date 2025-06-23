package day2_JavaControlFlows.level3PracticePrograms;
import java.util.Scanner;

public class q11_DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day: ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Apply the formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Day of week mapping
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Output result
        System.out.println("Day of the week is: " + days[d0]);
        scanner.close();
    }
}


