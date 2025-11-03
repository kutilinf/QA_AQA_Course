package Lesson_7_junit_5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("Проверка правильности вычисления факториала")
    void getFactorial(){
        FactorialJUnit f =  new FactorialJUnit();
        int actual = f.getFactorial(5);
        int expected = 120;
        assertEquals(expected, actual);
    }
}