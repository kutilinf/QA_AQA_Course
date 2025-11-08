package Lesson_7_junit_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTriangleTest {
    @Test
    @DisplayName("Проверка правильности вычисления площади треугольника")
    void getAreaTriangle() {
        AreaTriangle t = new AreaTriangle();
        double actual = t.getAreaTriangle(4, 3, 5);
        double expected = 6.0;
        assertEquals(expected, actual);
    }
}