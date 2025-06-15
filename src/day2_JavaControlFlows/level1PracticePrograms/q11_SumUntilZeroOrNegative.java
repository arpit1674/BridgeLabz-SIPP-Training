package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q11_SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double input = sc.nextDouble();
            if (input <= 0) break;
            total += input;
        }
        System.out.println("Total sum = " + total);
        sc.close();
    }
}
