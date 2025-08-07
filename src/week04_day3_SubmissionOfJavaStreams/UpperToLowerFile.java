package week04_day3_SubmissionOfJavaStreams;

import java.io.*;

public class UpperToLowerFile {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "lowercase.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("Conversion to lowercase completed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
