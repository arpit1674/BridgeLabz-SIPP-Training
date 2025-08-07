package week04_day3_SubmissionOfJavaStreams;

import java.io.*;
import java.util.Arrays;

public class ImageByteArrayCopy {
    public static void main(String[] args) {
        String inputImage = "original.jpg";
        String outputImage = "copy.jpg";

        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int read;
            while ((read = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, read);
            }

            byte[] imageData = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                 FileOutputStream fos = new FileOutputStream(outputImage)) {

                while ((read = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }

                System.out.println("Image copied using byte array.");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
