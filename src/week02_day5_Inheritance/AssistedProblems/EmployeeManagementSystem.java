package week02_day5_Inheritance.AssistedProblems;

class Employee {
    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + duration);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        e1.name = "John";
        e1.id = 101;
        e1.salary = 50000;
        ((Manager) e1).teamSize = 5;
        e1.displayDetails();
    }
}
