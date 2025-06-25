package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers.InstanceVsClassVariablesAndMethods;

public class Q2_OnlineCourseManagement {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Academy";

    public Q2_OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Q2_OnlineCourseManagement c1 = new Q2_OnlineCourseManagement("Java", 6, 15000);
        Q2_OnlineCourseManagement c2 = new Q2_OnlineCourseManagement("Python", 8, 18000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
