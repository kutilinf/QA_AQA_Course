package Lesson_7_testng;

public class FrameworkTestNG {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.getFactorial(5));

        AreaTriangle t = new AreaTriangle();
        System.out.println(t.getAreaTriangle(4, 3, 5));

        ArithmeticOperations x = new ArithmeticOperations();
        System.out.println(x.getArithmeticOperations(3, 6));

        CompareTwoNumbers y = new CompareTwoNumbers();
        System.out.println(y.getCompareTwoNumbers(3, 5));
    }
}