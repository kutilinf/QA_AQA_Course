package Lesson_7_junit_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

    @Test
    @DisplayName("Проверка правильности вычисления +,-,*,/")
    void getArithmeticOperations() {
        ArithmeticOperations x = new ArithmeticOperations();
        String actual = x.getArithmeticOperations(3, 6);
        String expected = "Сумма: 9 Разность: -3 Произведение: 18 Деление: 0.5";
        assertEquals(expected, actual);
    }
}