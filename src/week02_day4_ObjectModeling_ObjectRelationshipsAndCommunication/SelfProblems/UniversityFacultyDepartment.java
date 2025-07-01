package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;

public class UniversityFacultyDepartment {
    String name;
    ArrayList<Department2> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    UniversityFacultyDepartment(String name) {
        this.name = name;
    }
    void addDepartment(String dept) {
        departments.add(new Department2(dept));
    }
    void addFaculty(String name) {
        faculties.add(new Faculty(name));
    }
    void show() {
        System.out.println("University: " + name);
        for (Department2 d : departments) System.out.println("Department: " + d.name);
        for (Faculty f : faculties) System.out.println("Faculty: " + f.name);
    }
    public static void main(String[] args) {
        UniversityFacultyDepartment u = new UniversityFacultyDepartment("Delhi University");
        u.addDepartment("CS");
        u.addFaculty("Dr. Rao");
        u.show();
    }
}

class Department2 {
    String name;
    Department2(String name) {
        this.name = name;
    }
}

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}
