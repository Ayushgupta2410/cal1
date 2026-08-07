import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // Addition Test Cases
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(30, calculator.add(20, 10));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-30, calculator.add(-20, -10));
    }

    @Test
    public void testAddPositiveAndNegative() {
        assertEquals(10, calculator.add(20, -10));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(20, calculator.add(20, 0));
    }

    // Subtraction Test Cases
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(-10, calculator.subtract(-20, -10));
    }

    @Test
    public void testSubtractPositiveAndNegative() {
        assertEquals(30, calculator.subtract(20, -10));
    }

    @Test
    public void testSubtractWithZero() {
        assertEquals(20, calculator.subtract(20, 0));
    }
}