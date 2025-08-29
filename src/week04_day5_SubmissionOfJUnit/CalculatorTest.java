package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.api.Test;

public class CalculatorTest implements Test{

    Calculator calc = new Calculator();

    @Test void testAdd() { assertEquals(5, calc.add(2, 3)); }

    @Test void testSubtract() { assertEquals(1, calc.subtract(4, 3)); }

    @Test void testMultiply() { assertEquals(6, calc.multiply(2, 3)); }

    @Test void testDivide() { assertEquals(2, calc.divide(6, 3)); }

    @Test void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
