package week03_day4and5_LinearAndBinarySearch.InputStreamReader;

import java.io.*;

public class ReadFromConsoleWriteToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter writer = new FileWriter("user_input.txt");

            String input;
            System.out.println("Enter lines to write to file (type 'exit' to stop):");

            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input + "\n");
            }

            writer.close();
            br.close();
            isr.close();
            System.out.println("Input saved to user_input.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
