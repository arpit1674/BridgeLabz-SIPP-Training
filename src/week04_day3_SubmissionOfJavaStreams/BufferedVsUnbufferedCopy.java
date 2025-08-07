package week04_day3_SubmissionOfJavaStreams;

import java.io.*;

public class BufferedVsUnbufferedCopy {
    public static void main(String[] args) throws IOException {
        String source = "largefile.dat";
        String destBuffered = "buffered_copy.dat";
        String destUnbuffered = "unbuffered_copy.dat";

        long start, end;

        // Buffered copy
        start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destBuffered))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        end = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (end - start) / 1_000_000 + " ms");

        // Unbuffered copy
        start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destUnbuffered)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        end = System.nanoTime();
        System.out.println("Unbuffered Copy Time: " + (end - start) / 1_000_000 + " ms");
    }
}
