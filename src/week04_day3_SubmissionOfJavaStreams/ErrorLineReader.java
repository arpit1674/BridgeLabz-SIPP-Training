package week04_day3_SubmissionOfJavaStreams;

import java.io.*;

public class ErrorLineReader {
    public static void main(String[] args) {
        String file = "logfile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
