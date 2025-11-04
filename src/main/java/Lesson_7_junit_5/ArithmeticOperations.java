package Lesson_7_junit_5;

public class ArithmeticOperations {
    public ArithmeticOperations() {
    }

    public String getArithmeticOperations(int a, int b) {
        int sum, razn, proiz;
        double del;
        String s = "";
        sum = a + b;
        razn = a - b;
        proiz = a * b;
        del = (double) a / b;
        s = "Сумма: " + sum + " Разность: " + razn + " Произведение: " + proiz + " Деление: " + del;
        return s;
    }
}