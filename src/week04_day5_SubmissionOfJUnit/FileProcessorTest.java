package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String filename = "testFile.txt";

    @Test
    void testFileWriteAndRead() throws IOException {
        processor.writeToFile(filename, "Hello World");
        String content = processor.readFromFile(filename); 
        assertEquals("Hello World", content);
        assertTrue(new File(filename).exists());
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> processor.readFromFile("nonexistent.txt"));
    }
}
