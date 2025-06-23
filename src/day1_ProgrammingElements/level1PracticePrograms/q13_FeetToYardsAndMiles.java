package day1_ProgrammingElements.level1PracticePrograms;
import java.util.Scanner;
public class q13_FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles.");
        input.close();
    }
}
