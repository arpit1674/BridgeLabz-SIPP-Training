package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testTimeout() throws InterruptedException {
        tester.longRunningTask(); // This will fail due to 3-second sleep
    }
}
