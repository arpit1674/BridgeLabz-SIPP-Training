package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q13_MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number < 1 || number >= 100)
            System.out.println("Invalid input.");
        else {
            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter++;
            }
        }
        sc.close();
    }
}