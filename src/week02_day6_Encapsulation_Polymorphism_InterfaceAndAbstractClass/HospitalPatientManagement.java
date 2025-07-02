package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private String[] records;
    private int recordCount;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.records = new String[10];
        this.recordCount = 0;
    }

    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
        }
    }

    public void viewRecords() {
        for (int i = 0; i < recordCount; i++) {
            System.out.println("Record " + (i + 1) + ": " + records[i]);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String[] records;
    private int recordCount;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new String[10];
        this.recordCount = 0;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
        }
    }

    public void viewRecords() {
        for (int i = 0; i < recordCount; i++) {
            System.out.println("Record " + (i + 1) + ": " + records[i]);
        }
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient(101, "Ravi", 45, 4, 1500);
        patients[1] = new OutPatient(102, "Anita", 30, 500);

        for (int i = 0; i < patients.length; i++) {
            patients[i].getPatientDetails();
            MedicalRecord mr = (MedicalRecord) patients[i];
            mr.addRecord("Checkup complete");
            mr.addRecord("Prescribed medication");
            mr.viewRecords();
            System.out.println("Total Bill: ₹" + patients[i].calculateBill());
            System.out.println();
        }
    }
}
