package Lesson_7_testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AreaTriangleTest {

    @Test(testName = "Проверка правильности вычисления площади треугольника")
    public void testGetAreaTriangle() {
        AreaTriangle t = new AreaTriangle();
        double actual = t.getAreaTriangle(4, 3, 5);
        double expected = 6.0;
        assertEquals(expected, actual);
    }
}