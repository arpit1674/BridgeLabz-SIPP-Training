package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q5_UniversityStudentManagement {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Q5_UniversityStudentManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Q5_UniversityStudentManagement) {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Q5_UniversityStudentManagement s1 = new Q5_UniversityStudentManagement("Aman", 1, "A");
        Q5_UniversityStudentManagement s2 = new Q5_UniversityStudentManagement("Kiran", 2, "B");
        s1.display();
        s2.display();
        displayTotalStudents();
    }
}
