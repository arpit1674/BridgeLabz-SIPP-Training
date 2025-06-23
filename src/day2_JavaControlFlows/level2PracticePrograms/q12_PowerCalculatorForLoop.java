package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q12_PowerCalculatorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}
