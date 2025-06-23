package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q10_SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double input;
        do {
            System.out.print("Enter number (0 to stop): ");
            input = sc.nextDouble();
            total += input;
        } while (input != 0);
        System.out.println("Total sum = " + total);
        sc.close();
    }
}
