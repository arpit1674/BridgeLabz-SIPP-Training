package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q14_PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1, counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}
