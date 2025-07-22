package week03_day4and5_LinearAndBinarySearch.ChallengeProblem;

import java.io.*;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) {
        String filePath = "largefile.txt";

        try {
            long startFR = System.currentTimeMillis();
            FileReader fr = new FileReader(filePath);
            BufferedReader brFR = new BufferedReader(fr);
            int wordCountFR = 0;
            String lineFR;
            while ((lineFR = brFR.readLine()) != null) {
                wordCountFR += lineFR.trim().split("\\s+").length;
            }
            long endFR = System.currentTimeMillis();
            brFR.close();
            fr.close();
            System.out.println("FileReader - Word Count: " + wordCountFR + ", Time: " + (endFR - startFR) + "ms");

            long startISR = System.currentTimeMillis();
            InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
            BufferedReader brISR = new BufferedReader(isr);
            int wordCountISR = 0;
            String lineISR;
            while ((lineISR = brISR.readLine()) != null) {
                wordCountISR += lineISR.trim().split("\\s+").length;
            }
            long endISR = System.currentTimeMillis();
            brISR.close();
            isr.close();
            System.out.println("InputStreamReader - Word Count: " + wordCountISR + ", Time: " + (endISR - startISR) + "ms");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}