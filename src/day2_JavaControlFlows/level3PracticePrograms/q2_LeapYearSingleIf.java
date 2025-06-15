package day2_JavaControlFlows.level3PracticePrograms;
import java.util.Scanner;
public class q2_LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid year. Leap year calculation is valid only from 1582 onwards.");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
        sc.close();
    }
}
