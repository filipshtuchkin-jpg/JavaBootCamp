package module10;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    // testing adding two positive numbers
    @Test
    public void testAddTwo() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }
    // testing adding two negative numbers
    @Test
    public void testAddNegativeN() {
        Calculator calculator = new Calculator();
        assertEquals(-10, calculator.add(-8, -2));
    }
    // testing adding three positive numbers
    @Test
    public void testAddThree() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(1, 2, 3));
    }
    // testing adding three negative numbers
    @Test
    public void testAddNegativeThree() {
        Calculator calculator = new Calculator();
        assertEquals(-15, calculator.add(-8, -2, -5));
    }
    // testing subtraction two positive numbers
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.subtract(10, 2));
    }
    // testing subtraction two negative numbers
    @Test
    public void testSubtractNegativeN() {
        Calculator calculator = new Calculator();
        assertEquals(-8, calculator.subtract(-10, -2));
    }
    @Test
    //testing divide of two numbers
    public void testDivide (){
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.divide(10, 2), 0.001);
    }

    @Test // testing divide on Zero
    public void testDivideOnZero (){
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.divide(10, 0), 0.001);
    }

    @Test //testing multiplication
    public void testMuliply (){
        Calculator calculator = new Calculator();
        assertEquals(200, calculator.multiply(10, 20));
    }
    @Test //testing multiplication on zero (with custom exception rule)
    public void testMultiplyOnZero (){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 20));
    }

}