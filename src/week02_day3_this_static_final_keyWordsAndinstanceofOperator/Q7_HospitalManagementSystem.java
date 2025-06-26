package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q7_HospitalManagementSystem {
    static String hospitalName = "Care Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name, ailment;
    int age;

    public Q7_HospitalManagementSystem(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Q7_HospitalManagementSystem) {
            System.out.println("ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Q7_HospitalManagementSystem p1 = new Q7_HospitalManagementSystem(101, "Rakesh", 45, "Fever");
        p1.display();
        getTotalPatients();
    }
}
