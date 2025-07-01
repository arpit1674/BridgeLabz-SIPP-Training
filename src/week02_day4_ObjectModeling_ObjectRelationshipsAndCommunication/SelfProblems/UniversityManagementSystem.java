package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.SelfProblems;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student2 s = new Student2("Raj");
        Professor p = new Professor("Dr. Singh");
        Course2 c = new Course2("AI");
        s.enrollCourse(c);
        p.assignProfessor(c);
    }
}

class Student2 {
    String name;
    Student2(String name) {
        this.name = name;
    }
    void enrollCourse(Course2 c) {
        System.out.println(name + " enrolled in " + c.name);
    }
}

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
    void assignProfessor(Course2 c) {
        System.out.println(name + " assigned to " + c.name);
    }
}

class Course2 {
    String name;
    Course2(String name) {
        this.name = name;
    }
}
