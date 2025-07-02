package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface Department {
    void assignDepartment();
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    public double calculateSalary() {
        return 1.2 * getBaseSalary();
    }

    public void assignDepartment() {}

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hours, double rate, String department) {
        super(id, name, baseSalary);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
        this.department = department;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment() {}

    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "John", 30000, "HR");
        Employee e2 = new PartTimeEmployee(2, "Alice", 0, 80, 200, "Finance");

        e1.displayDetails();
        e2.displayDetails();
    }
}
