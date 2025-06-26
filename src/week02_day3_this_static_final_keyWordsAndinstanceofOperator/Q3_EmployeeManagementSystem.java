package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q3_EmployeeManagementSystem {
    static String companyName = "TechSoft";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    public Q3_EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        if (this instanceof Q3_EmployeeManagementSystem) {
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Q3_EmployeeManagementSystem e1 = new Q3_EmployeeManagementSystem("Ravi", 101, "Developer");
        Q3_EmployeeManagementSystem e2 = new Q3_EmployeeManagementSystem("Anu", 102, "Tester");
        e1.display();
        e2.display();
        displayTotalEmployees();
    }
}
