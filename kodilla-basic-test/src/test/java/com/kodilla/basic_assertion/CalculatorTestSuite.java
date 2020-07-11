package com.kodilla.basic_assertion;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = -5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(3, sumResult);
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-13, subtractResult);
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }
}