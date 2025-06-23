package EXTRAS_built_in_functions;

import java.time.LocalDate;
import java.util.Scanner;

public class Problem2_DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date in format yyyy-MM-dd: ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + result);
        sc.close();    }
}
