package week02_day1_JavaClassAndObject;
import java.util.*;

public class Q1_EmployeeDetails {
    String name;
    int id;
    double salary;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.close();    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Q1_EmployeeDetails emp = new Q1_EmployeeDetails();
        emp.getDetails();
        emp.displayDetails();
    }
}
