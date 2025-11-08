package Lesson_7_testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticOperationsTest {

    @Test(testName = "Проверка правильности вычисления +,-,*,/")
    public void testGetArithmeticOperations() {
        ArithmeticOperations x = new ArithmeticOperations();
        String actual = x.getArithmeticOperations(3, 6);
        String expected = "Сумма: 9 Разность: -3 Произведение: 18 Деление: 0.5";
        assertEquals(expected, actual);
    }
}