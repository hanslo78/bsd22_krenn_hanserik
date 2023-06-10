package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    Calculator calculator;


    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testCaseAdd1() {
        assertEquals(8, calculator.add(5, 3));
    }


    @Test
    public void testCaseAdd2() {
        assertEquals(4.5, calculator.add(2.5, 2.0));
    }

    @Test
    public void testCaseAdd3() {
        assertEquals(6.5, calculator.add(4.5, 2.0));
    }


    @Test
    public void testCaseMinus1() {
        assertEquals(2, calculator.minus(5, 3));
    }

    @Test
    public void testCaseMinus2() {
        assertEquals(2.5, calculator.minus(4.5, 2));
    }

    @Test
    public void testCaseMinus3() {
        assertEquals(40, calculator.minus(79, 39));
    }

    @Test
    public void testCaseMultiply1() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testCaseMultiply2() {
        assertEquals(3.75, calculator.multiply(2.5, 1.5));
    }

    @Test
    public void testCaseMultiply3() {
        assertEquals(75, calculator.multiply(5, 15));
    }


    @Test
    public void testCaseDivide1() {
        assertEquals(15, calculator.divide(150, 10));
    }

    @Test
    public void testCaseDivide2() {
        assertEquals(8, calculator.divide(20, 2.5));
    }

    @Test
    public void testCaseDivide3() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void testCaseDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    public void testCaseFaculty1() {
        assertEquals(120, calculator.faculty(5));
    }

    @Test
    public void testCaseFaculty2() {
        assertEquals(0, calculator.faculty(0));
    }

    @Test
    public void testCaseFaculty3() {
        assertEquals(2, calculator.faculty(2.0));
    }


}
