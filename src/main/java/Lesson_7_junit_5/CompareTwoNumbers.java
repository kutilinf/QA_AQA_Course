package Lesson_7_junit_5;

public class CompareTwoNumbers {
    public CompareTwoNumbers() {
    }

    public String getCompareTwoNumbers(int a, int b){
        if (a > b) {
            return a + " > " + b;
        } else if (a < b) {
            return a + " < " + b;
        } else {
            return a + " = " + b;
        }
    }
}