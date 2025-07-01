package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.AssistedProblems;
import java.util.ArrayList;

public class Q3_CompanyDepartmentComposition {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    Q3_CompanyDepartmentComposition(String name) {
        this.name = name;
    }
    void addDepartment(String deptName, String empName) {
        departments.add(new Department(deptName, empName));
    }
    void show() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.show();
        }
    }
    public static void main(String[] args) {
        Q3_CompanyDepartmentComposition comp = new Q3_CompanyDepartmentComposition("TechCorp");
        comp.addDepartment("IT", "John");
        comp.addDepartment("HR", "Doe");
        comp.show();
    }
}

class Department {
    String name;
    Employee emp;
    Department(String name, String empName) {
        this.name = name;
        this.emp = new Employee(empName);
    }
    void show() {
        System.out.println("Dept: " + name + ", Employee: " + emp.name);
    }
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}
