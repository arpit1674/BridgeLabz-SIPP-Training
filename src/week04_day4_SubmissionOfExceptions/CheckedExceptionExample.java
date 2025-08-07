package week04_day4_SubmissionOfExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
