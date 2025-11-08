package Lesson_7_junit_5;

public class Factorial {
    public Factorial() {
    }

    public int getFactorial(int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        return result;
    }
}