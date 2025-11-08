package Lesson_7_testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CompareTwoNumbersTest {

    @Test(testName = "Проверка правильности сравнения дву чисел")
    public void testGetCompareTwoNumbers() {
        CompareTwoNumbers y = new CompareTwoNumbers();
        String actual = y.getCompareTwoNumbers(3, 5);
        String expected = "3 < 5";
        assertEquals(expected, actual);
    }
}