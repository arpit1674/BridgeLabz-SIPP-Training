package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q7_SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
        sc.close();
    }
}
