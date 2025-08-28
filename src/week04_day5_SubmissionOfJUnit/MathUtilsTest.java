package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    MathUtils math = new MathUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int num) {
        if (num % 2 == 0)
            assertTrue(math.isEven(num));
        else
            assertFalse(math.isEven(num));
    }
}
