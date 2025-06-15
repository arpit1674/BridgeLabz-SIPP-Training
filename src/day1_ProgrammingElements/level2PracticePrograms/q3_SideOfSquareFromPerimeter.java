package day1_ProgrammingElements.level2PracticePrograms;
import java.util.Scanner;
public class q3_SideOfSquareFromPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}
