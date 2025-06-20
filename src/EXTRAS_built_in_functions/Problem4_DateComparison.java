package EXTRAS_built_in_functions;

import java.time.LocalDate;
import java.util.Scanner;

public class Problem4_DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String input1 = sc.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String input2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Both dates are equal");
        }
        sc.close();
    }
}
