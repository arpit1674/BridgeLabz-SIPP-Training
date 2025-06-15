package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q3_MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
    }
}