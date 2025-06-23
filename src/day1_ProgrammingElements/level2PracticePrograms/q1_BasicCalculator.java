package day1_ProgrammingElements.level2PracticePrograms;
import java.util.Scanner;
public class q1_BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
        input.close();
    }
}
