package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.Class_ObjectAndSequenceDiagram;

import java.util.*;

class Student {
    String name;
    List<Subject> subjects;

    Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }

    List<Subject> getSubjects() {
        return subjects;
    }
}

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class GradeCalculator {
    static void calculateGrade(Student student) {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.marks;
        }
        double average = total / (double) student.getSubjects().size();
        String grade = average >= 90 ? "A" : average >= 75 ? "B" : average >= 60 ? "C" : "D";
        System.out.println("Student: " + student.name);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class SchoolResultsApplication {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));
        GradeCalculator.calculateGrade(student);
    }
}
