package Lesson_7_testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {

    @Test(testName = "Проверка правильности вычисления факториала")
    public void testGetFactorial() {
        Factorial f = new Factorial();
        int actual = f.getFactorial(5);
        int expected = 120;
        assertEquals(expected, actual);
    }
}