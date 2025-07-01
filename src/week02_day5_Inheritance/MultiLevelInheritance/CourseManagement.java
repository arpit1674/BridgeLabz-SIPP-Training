package week02_day5_Inheritance.MultiLevelInheritance;

class Course {
    String courseName;
    int duration;
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    void showCourseDetails() {
        System.out.println(courseName + " " + duration + " " + platform + " " + isRecorded + " " + fee + " " + discount);
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse();
        poc.courseName = "DSA";
        poc.duration = 30;
        poc.platform = "Udemy";
        poc.isRecorded = true;
        poc.fee = 999.99;
        poc.discount = 100.00;
        poc.showCourseDetails();
    }
}
