package week02_day1_JavaClassAndObject;

import java.util.Scanner;

public class Q1_EmployeeDetails {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1_EmployeeDetails emp = new Q1_EmployeeDetails();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp.id = sc.nextInt();

        System.out.print("Enter Salary: ");
        emp.salary = sc.nextDouble();

        emp.displayDetails();
        sc.close();
    }
}
