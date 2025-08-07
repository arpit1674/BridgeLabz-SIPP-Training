package week04_day3_SubmissionOfJavaStreams;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String file = "students.dat";

        // Writing
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(8.9);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
