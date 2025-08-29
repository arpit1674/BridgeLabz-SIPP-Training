package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    Division div = new Division();

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> div.divide(10, 0));
    }
}
