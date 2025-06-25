package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers.AccessModifiers;

import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Q4_EmployeeRecords extends Employee {
    public Q4_EmployeeRecords(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();

        Q4_EmployeeRecords e = new Q4_EmployeeRecords(id, dept, sal);
        e.display();

        System.out.print("Enter new salary to update: ");
        sal = sc.nextDouble();
        e.setSalary(sal);
        e.display();
        sc.close();
    }
}
