package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test void testReverse() {
        assertEquals("cba", utils.reverse("abc"));
    }

    @Test void testPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }
}
