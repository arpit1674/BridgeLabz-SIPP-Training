package week03_day4and5_LinearAndBinarySearch.ChallengeProblem;

import java.io.*;

public class CompareStringBuilderBufferAndReaders {
    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaderAndInputStreamReader();
    }

    static void compareStringBuilderAndBuffer() {
        String str = "hello";

        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(str);
        }
        long endSB = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endSB - startSB) + "ms");

        long startSBF = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbf.append(str);
        }
        long endSBF = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endSBF - startSBF) + "ms");
    }

    static void compareFileReaderAndInputStreamReader() {
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