package Lesson_7_junit_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTwoNumbersTest {

    @Test
    @DisplayName("Проверка правильности сравнения дву чисел")
    void getCompareTwoNumbers() {
        CompareTwoNumbers y = new CompareTwoNumbers();
        String actual = y.getCompareTwoNumbers(3, 5);
        String expected = "3 < 5";
        assertEquals(expected, actual);
    }
}