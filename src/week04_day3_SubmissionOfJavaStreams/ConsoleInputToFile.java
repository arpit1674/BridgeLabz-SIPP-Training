package week04_day3_SubmissionOfJavaStreams;

import java.io.*;

public class ConsoleInputToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_info.txt")) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + language);
            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
