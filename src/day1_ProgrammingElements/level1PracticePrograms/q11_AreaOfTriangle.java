package day1_ProgrammingElements.level1PracticePrograms;
import java.util.Scanner;
public class q11_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("Area in square inches: " + areaInInches);
        System.out.println("Area in square cm: " + areaInCm);
        input.close();
    }
}
