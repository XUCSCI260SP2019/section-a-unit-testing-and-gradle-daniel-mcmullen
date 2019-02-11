package edu.xavier.csci;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test public void canAddTwoNumbers() {
        Calculator classUnderTest = new Calculator();
        assertEquals("2 + 3 must equal 5", 5, classUnderTest.add(2,3));
        assertEquals("15 + 5 must equal 20", 20, classUnderTest.add(15,5));
        assertEquals("321 + 9 must equal 330", 330, classUnderTest.add(321,9));
    }
    @Test public void canAddMoreThanTwoNumbers(){
        Calculator classUnderTest = new Calculator();
        assertEquals("2 + 2 + 2 must equal 6", 6, classUnderTest.add(2,2,2));
        assertEquals("2 + 2 + 2 + 2 must equal 8", 8, classUnderTest.add(2,2,2,2));
        assertEquals("2 + 2 + 2 + 2 + 2 must equal 10", 10, classUnderTest.add(2,2,2,2,2));
    }
    @Test public void zeroArgsProvided(){
        Calculator classUnderTest = new Calculator();
        assertEquals("no arguments returns 0", 0, classUnderTest.add());
    }
    @Test public void oneArgProvided(){
        Calculator classUnderTest = new Calculator();
        assertEquals("one argument equals argument (1)", 1, classUnderTest.add(1));
        assertEquals("one argument equals argument (5)", 5, classUnderTest.add(5));
    }
}
