package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication_SelfProblems;


import java.util.*;

public class Q1_SchoolStudentCourse {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);

        s1.showCourses();
        s2.showCourses();
        c2.showStudents();
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class Course {
    String name;
    List<Student> students = new ArrayList<>();
    Course(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        students.add(s);
    }
    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
