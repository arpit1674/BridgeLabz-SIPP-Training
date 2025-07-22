package week04_day1_SubmissionOfJavaGenerics;

import java.util.List;

abstract class CourseType {
    abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    String getEvaluationMethod() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    String getEvaluationMethod() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    String getEvaluationMethod() {
        return "Research-Based";
    }
}

class Course<T extends CourseType> {
    private T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    public void showCourseInfo() {
        System.out.println("Course is " + courseType.getEvaluationMethod());
    }
}

public class UniversityCourseSystem {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getEvaluationMethod());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> course = new Course<>(new ExamCourse());
        course.showCourseInfo();
    }
}
