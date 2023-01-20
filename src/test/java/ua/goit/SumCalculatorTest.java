package ua.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    public SumCalculator sumCalculator;

    @BeforeEach
    public void initBeforeEach(){
         sumCalculator = new SumCalculator();
    }
    @Test
    void testSumCalculatorShouldReturn1(){
        //given
        int currentNumber = 1;
        //when
        int actualNumber = sumCalculator.sum(currentNumber);
        //then
        int expectedNumber =1;
        assertEquals(expectedNumber,actualNumber);
    }
    @Test
    void testSumCalculatorShouldReturn6(){
        //given
        int currentNumber = 3;
        //when
        int actualNumber = sumCalculator.sum(currentNumber);
        //then
        int expectedNumber =6;
        assertEquals(expectedNumber,actualNumber);
    }
    @Test
    void testSumCalculatorShouldThrowIllegalArgumentException(){
        //given
        int currentNumber = 0;
        //when, then
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(currentNumber));
    }
}