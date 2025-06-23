package day4_JavaMethods.level3PracticeProblems;
import java.util.Scanner;

public class Q9_CalendarGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();    }

    static void printCalendar(int month, int year) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Leap year adjustment
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        int startDay = getStartDay(month, year);
        int numberOfDays = daysInMonth[month];

        // Print month and year header
        System.out.printf("\n  %s %d\n", months[month], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First line spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0 || day == numberOfDays) {
                System.out.println();
            }
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    static int getStartDay(int month, int year) {
        int y = year;
        int m = month;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }
}